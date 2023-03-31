package se.gottfridn.library.version;

import se.gottfridn.library.identifier.ModIdentifier;

import java.util.StringJoiner;

public class SubVersionFactory {
	public static SubVersion getNumericalSubVersion(String numericalIdentifier, Integer[] numericalVersion, Character git) {
		StringJoiner numericalVersionJoiner = new StringJoiner(Separator.SOFT.toString());
		for (Integer number : numericalVersion) {
			numericalVersionJoiner.add(number.toString());
		}

		VersionPart numericalIdentifierPart = new VersionPart(numericalIdentifier, Separator.MEDIUM);
		VersionPart numericalVersionPart = new VersionPart(numericalVersionJoiner.toString(), Separator.MEDIUM);
		VersionPart gitPart = new VersionPart(git.toString(), Separator.END);

		VersionPart[] parts = {numericalIdentifierPart, numericalVersionPart, gitPart};

		return getSubVersion(parts);
	}

	public static SubVersion getIdentifierSubVersion(ModIdentifier identifier) {
		VersionPart idPart = new VersionPart(identifier.getId(), Separator.MEDIUM);
		VersionPart stabilityPart = new VersionPart(identifier.getStability(), Separator.END);
		VersionPart[] parts = {idPart, stabilityPart};

		return new SubVersionImplementation(parts);
	}

	public static SubVersion getSubVersion(VersionPart[] parts) {
		return new SubVersionImplementation(parts);
	}

	static final class SubVersionImplementation
		implements SubVersion {
		private final VersionPart[] parts;

		public SubVersionImplementation(VersionPart[] parts) {
			this.parts = parts;
		}

		@Override
		public VersionPart[] getParts() {
			return parts;
		}

		@Override
		public String toVersionFormat() {
			StringBuilder builder = new StringBuilder();
			for (VersionPart part : parts) {
				builder.append(part.toVersionFormat());
			}
			return builder.toString();
		}
	}
}
