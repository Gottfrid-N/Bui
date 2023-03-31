package se.gottfridn.library.version;

/**
 * This interface represents the {@code Version} of a mod using a {@link SubVersion} array,
 * <p>
 *     The {@code Version} interface defines the
 *     {@link Version#getSubVersions()} method for getting the
 *     {@link SubVersion} array of the {@code Version}.
 * </p><p>
 *     It extends {@link VersionFormat},
 *     so you can use {@link Version#toVersionFormat()} to get a {@link String} representation of the version.
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
