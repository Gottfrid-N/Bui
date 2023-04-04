package se.gottfridn.library.version.format;

import se.gottfridn.library.version.SubVersion;
import se.gottfridn.library.version.Version;
import se.gottfridn.library.version.VersionPart;

/**
 * This enum contains different {@code separators} for {@link VersionFormat}.
 *
 * @see VersionFormat
 * @see Version
 * @see SubVersion
 * @see VersionPart
 */
public enum Separator {
	/**
	 * This {@code separator} is used between each {@link SubVersion} in a {@link Version}.
	 */
	SUB_VERSION('|'),

	/**
	 * This {@code separator} is used between each {@link VersionPart} in a {@link SubVersion}.
	 */
	VERSION_PART('-'),

	/**
	 * This {@code separator} is used between each {@link String} in a {@link VersionPart}
	 */
	SUB_VERSION_PART('.');

	private final Character separator;

	Separator(Character separator) {
		this.separator = separator;
	}

	@Override
	public String toString() {
		return this.separator.toString();
	}
}
