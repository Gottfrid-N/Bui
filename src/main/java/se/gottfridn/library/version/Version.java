package se.gottfridn.library.version;

import se.gottfridn.library.version.format.VersionFormat;

/**
 * This interface represents the {@code Version} of a mod using a {@link SubVersion} array,
 * <p>
 *     This interface defines the
 *     {@link Version#getSubVersions()} method for accessing the
 *     {@link SubVersion} array of the {@code Version}.
 * </p><p>
 *     This extends {@link VersionFormat},
 *     so {@link Version#toVersionFormat()} can be used to get a {@link String} representation of the version.
 * </p>
 *
 * @see SubVersion
 * @see VersionPart
 * @see VersionFormat
 */
public interface Version
	extends VersionFormat{
	/**
	 * Gets the {@link SubVersion} array.
	 *
	 * @return The {@link SubVersion} array.
	 */
	SubVersion[] getSubVersions();

	/**
	 * Converts the {@link SubVersion} array to a formatted {@link String}.
	 *
	 * @return The formatted {@link String}
	 */
	@Override
	String toVersionFormat();
}
