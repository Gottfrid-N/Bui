package se.gottfridn.library.version.factory;

import se.gottfridn.library.version.SubVersion;
import se.gottfridn.library.version.Version;
import se.gottfridn.library.version.format.Separator;
import se.gottfridn.library.version.format.VersionFormatter;

/**
 * This class is a factory for creating instances of {@link Version}.
 * <p>
 *     This class provides the static method {@link #getVersion(SubVersion[])} for creating instances of {@link Version}.
 * </p><p>
 *     This class also provides the static method {@link #getVersion(SubVersion)}
 *     for creating instance of {@link Version} with only one {@link SubVersion}, this helps reduce boilerplate.
 * </p>
 * @see #getVersion(SubVersion)
 * @see #getVersion(SubVersion[])
 * @see Version
 */
public class VersionFactory {
	/**
	 * Constructs a new {@link Version} instance with specified {@link SubVersion} array.
	 * <p>
	 *     The {@link SubVersion} array is automatically created with its only element being the {@code subVersion}.
	 * </p>
	 *
	 * @param subVersion The {@link SubVersion} to be used for the automatically generated {@link SubVersion} array.
	 * @return The {@link Version} array.
	 */
	public static Version getVersion(SubVersion subVersion) {
		return getVersion(new SubVersion[]{subVersion});
	}

	/**
	 * Constructs a new {@link Version} instance with specified {@link SubVersion} array.
	 *
	 * @param subVersions The {@link SubVersion} array.
	 * @return The {@link Version} instance.
	 */
	public static Version getVersion(SubVersion[] subVersions) {
		return new VersionImplementation(subVersions);
	}

	private record VersionImplementation(SubVersion[] subVersions)
			implements Version {
		@Override
		public SubVersion[] getSubVersions() {
			return subVersions();
		}

		@Override
		public String toVersionFormat() {
			return VersionFormatter.format(getSubVersions(), Separator.SUB_VERSION);
		}
	}
}
