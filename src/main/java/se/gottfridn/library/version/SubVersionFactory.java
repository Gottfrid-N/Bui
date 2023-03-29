package se.gottfridn.library.version;

import se.gottfridn.library.identifier.ModIdentifier;

import java.util.StringJoiner;

public class SubVersionFactory {
	public static SubVersion getNumericalSubVersion(String numericalIdentifier, Integer[] numericalVersion, Character git) {
		StringJoiner numericalVersionJoiner = new StringJoiner(Separator.SOFT.toString());
		for (Integer integer : numericalVersion) {
			numericalVersionJoiner.add(integer.toString());
		}
		VersionPart[] parts = {
			new VersionPart(numericalIdentifier, Separator.MEDIUM),
			new VersionPart(numericalVersionJoiner.toString(), Separator.MEDIUM),
			new VersionPart(git.toString(), Separator.END)};
		return getSubVersion(parts);
	}

	public static SubVersion getIdentifierSubVersion(ModIdentifier identifier) {
		VersionPart[] parts = {
			new VersionPart(identifier.getId(), Separator.MEDIUM),
			new VersionPart(identifier.getStability(), Separator.END)};
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
				builder.append(part.toString());
			}
			return builder.toString();
		}
	}
}
