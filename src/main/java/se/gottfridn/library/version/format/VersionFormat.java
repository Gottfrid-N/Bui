package se.gottfridn.library.version.format;

import se.gottfridn.library.version.SubVersion;
import se.gottfridn.library.version.Version;
import se.gottfridn.library.version.VersionPart;

/**
 * This interface defines a method for converting a {@code Version} into a formatted string
 *
 * @implSpec Separators are expected to be from the {@link Separator} enum.
 *
 * @see Version
 * @see SubVersion
 * @see VersionPart
 * @see Separator
 */

@FunctionalInterface
public interface VersionFormat {
	/**
	 * Returns a formatted {@link String}
	 *
	 * @return The formatted {@link String}
	 */
	String toVersionFormat();
}
