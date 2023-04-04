package se.gottfridn.library.version.factory;

import se.gottfridn.library.identifier.ModIdentifier;
import se.gottfridn.library.version.SubVersion;
import se.gottfridn.library.version.VersionPart;
import se.gottfridn.library.version.format.Separator;

import java.util.StringJoiner;

public class SubVersionFactory {
	public static SubVersion getIdentifierSubVersion(ModIdentifier identifier) {
		VersionPart idPart = VersionPartFactory.getStringVersionPart(identifier.getId());
		VersionPart stabilityPart = VersionPartFactory.getStringVersionPart(identifier.getStability());
		VersionPart[] parts = new VersionPart[]{idPart, stabilityPart};
		return getSubVersion(parts);
	}

	public static SubVersion getNumericalSubVersion(String numericalIdentifier, Number[] numericalVersion) {
		VersionPart identifierPart = VersionPartFactory.getStringVersionPart(numericalIdentifier);
		VersionPart numericalPart = VersionPartFactory.getNumericalVersionPart(numericalVersion);
		VersionPart[] parts = new VersionPart[]{identifierPart, numericalPart};
		return getSubVersion(parts);
	}

	public static SubVersion getSubVersion(VersionPart[] parts) {
		return new SubVersionImplementation(parts);
	}

	private record SubVersionImplementation(VersionPart[] parts)
		implements SubVersion {
		@Override
		public VersionPart[] getParts() {
			return parts();
		}

		@Override
		public String toVersionFormat() {
			StringJoiner joiner = new StringJoiner(Separator.VERSION_PART.toString());
			for (VersionPart part : parts()) {
				joiner.add(part.toVersionFormat());
			}
			return joiner.toString();
		}
	}
}
