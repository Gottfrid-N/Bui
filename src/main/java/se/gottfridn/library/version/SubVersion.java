package se.gottfridn.library.version;

import se.gottfridn.library.version.format.VersionFormat;

/**
 * This interface represents a {@code SubVersion} of a {@link Version} using a {@link VersionPart} array.
 * <p>
 *    This interface defines the method {@link SubVersion#getParts()} for accessing the {@link VersionPart} array.
 * </p><p>
 *     This extends {@link VersionFormat},
 *     so {@link Version#toVersionFormat()} can be used to get a {@link String} representation of the {@code SubVersion}.
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
