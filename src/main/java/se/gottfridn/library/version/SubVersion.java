package se.gottfridn.library.version;

/**
 * This interface represents a {@code SubVersion} of a {@link Version} using a {@link VersionPart} array.
 * <p>
 *    It defines the method {@link SubVersion#getParts()} for getting the {@link VersionPart} array.
 * </p>
 *
 * @see Version
 * @see VersionPart
 * @see VersionFormat
 */
public interface SubVersion
		extends VersionFormat {
	/**
	 * Gets the {@link VersionPart} array.
	 *
	 * @return The {@link VersionPart} array.
	 */
	VersionPart[] getParts();

	/**
	 * Converts the {@link VersionPart} array to a formatted {@link String}.
	 *
	 * @return The formatted {@link String}
	 */
	@Override
	String toVersionFormat();
}
