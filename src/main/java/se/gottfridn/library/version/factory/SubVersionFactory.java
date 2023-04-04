package se.gottfridn.library.version.factory;

import se.gottfridn.library.identifier.ModIdentifier;
import se.gottfridn.library.version.SubVersion;
import se.gottfridn.library.version.VersionPart;
import se.gottfridn.library.version.format.Separator;

import java.util.StringJoiner;

public class SubVersionFactory {
	public static SubVersion getIdentifierSubVersion(ModIdentifier identifier) {
		VersionPart idPart = VersionPartFactory.getStringPart(identifier.getId());
		VersionPart stabilityPart = VersionPartFactory.getStringPart(identifier.getStability());
		VersionPart[] parts = new VersionPart[]{idPart, stabilityPart};
		return getSubVersion(parts);
	}

	public static SubVersion getNumericalSubVersion(String numericalIdentifier, Number[] numericalVersion) {
		VersionPart identifierPart = VersionPartFactory.getStringPart(numericalIdentifier);
		VersionPart numericalPart = VersionPartFactory.getNumericalPart(numericalVersion);
		VersionPart[] parts = new VersionPart[]{identifierPart, numericalPart};
		return getSubVersion(parts);
	}

	public static SubVersion getSubVersion(VersionPart part) {
		return getSubVersion(new VersionPart[]{part});
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
