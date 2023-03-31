package se.gottfridn.library.version;

/**
 * This interface defines a method for converting a version into a formatted string
 *
 * @implSpec Separators are expected to be from the {@link Separator} enum.
 *
 * @see Version
 * @see SubVersion
 * @see VersionPart
 * @see Separator
 */

@FunctionalInterface
interface VersionFormat {
	/**
	 * Returns a formatted {@link String}
	 *
	 * @return The formatted {@link String}
	 */
	String toVersionFormat();
}
