package se.gottfridn.library.version.factory;

import se.gottfridn.library.identifier.ModIdentifier;
import se.gottfridn.library.version.SubVersion;
import se.gottfridn.library.version.VersionPart;
import se.gottfridn.library.version.VersionSubPart;
import se.gottfridn.library.version.format.Separator;
import se.gottfridn.library.version.format.VersionFormatter;

/**
 * This class is a factory for creating instances of {@link SubVersion}.
 * <p>
 *     This class provides the static method {@link #getSubVersion(VersionPart[])} for creating instances of {@link SubVersion}.
 * </p><p>
 *     This class also provides the static methods
 *     {@link #getSubVersion(VersionPart)},
 *     {@link #getNumericalSubVersion(String, Number[])} and
 *     {@link #getNumericalSubVersion(String, Number[])}.
 * </p>
 * @see #getSubVersion(VersionPart[])
 * @see #getSubVersion(VersionPart)
 * @see #getNumericalSubVersion(String, Number[])
 * @see #getIdentifierSubVersion(ModIdentifier)
 * @see SubVersion
 */
public class SubVersionFactory {
	/**
	 * Constructs a new {@link SubVersion} instance with specified {@link VersionPart} array.
	 * <p>
	 *     The {@link VersionPart} array is automatically created with two elements: the {@code identifierPart} and {@code numericalPart}.
	 * </p>
	 * @param numericalIdentifier The {@link String} identifier to be used for the {@code identifierPart}.
	 * @param numericalVersion The {@link Number} array to be used for the {@code numericalPart}.
	 * @return The {@link SubVersion} instance.
	 */
	public static SubVersion getNumericalSubVersion(String numericalIdentifier, Number[] numericalVersion) {
		VersionPart identifierPart = VersionPartFactory.getStringPart(numericalIdentifier);
		VersionPart numericalPart = VersionPartFactory.getNumericalPart(numericalVersion);
		VersionPart[] parts = new VersionPart[]{identifierPart, numericalPart};
		return getSubVersion(parts);
	}

	/**
	 * Constructs a new {@link SubVersion} instance with specified {@link VersionPart} array.
	 * <p>
	 *     The {@link VersionPart} array is automatically created with two elements: the {@code identifiers} id and stability.
	 * </p>
	 *
	 * @param identifier The {@link ModIdentifier} to be used for the {@link VersionPart} array.
	 * @return The {@link SubVersion} instance.
	 */
	public static SubVersion getIdentifierSubVersion(ModIdentifier identifier) {
		VersionPart idPart = VersionPartFactory.getStringPart(identifier.getId());
		VersionPart stabilityPart = VersionPartFactory.getStringPart(identifier.getStability());
		VersionPart[] parts = new VersionPart[]{idPart, stabilityPart};
		return getSubVersion(parts);
	}

	/**
	 * Constructs a new {@link SubVersion} instance with specified {@link VersionPart} array.
	 * <p>
	 *     The {@link VersionPart} array is automatically created with its one element being the {@code part}.
	 * </p>
	 *
	 * @param part The {@link VersionSubPart} to be used in the {@link VersionSubPart} array.
	 * @return The {@link VersionPart} instance.
	 */
	public static SubVersion getSubVersion(VersionPart part) {
		return getSubVersion(new VersionPart[]{part});
	}

	/**
	 * Constructs a new {@link SubVersion} instance with specified {@link VersionPart} array.
	 *
	 * @param parts The {@link VersionPart} array.
	 * @return The {@link SubVersion} instance.
	 */
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
			return VersionFormatter.format(getParts(), Separator.VERSION_PART);
		}
	}
}
