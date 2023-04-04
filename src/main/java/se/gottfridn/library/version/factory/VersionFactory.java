package se.gottfridn.library.version.factory;

import se.gottfridn.library.version.SubVersion;
import se.gottfridn.library.version.Version;
import se.gottfridn.library.version.format.Separator;
import se.gottfridn.library.version.format.VersionFormatter;

public class VersionFactory {
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
			VersionFormatter<SubVersion> formatter = new VersionFormatter<>(subVersions(), Separator.SUB_VERSION);
			return formatter.toString();
		}
	}
}
