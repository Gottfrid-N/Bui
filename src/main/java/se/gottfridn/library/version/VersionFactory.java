package se.gottfridn.library.version;

import se.gottfridn.library.identifier.ModIdentifier;

import java.util.StringJoiner;

public class VersionFactory {
	public static Version getVersion(ModIdentifier identifier, SubVersion[] subVersions) {
		return new VersionImplementation(identifier, subVersions);
	}

	static final class VersionImplementation
		implements Version {
		private final ModIdentifier identifier;
		private final SubVersion[] subVersions;

		public VersionImplementation(ModIdentifier identifier, SubVersion[] subVersions) {
			this.subVersions = subVersions;
			this.identifier = identifier;
		}

		@Override
		public String getVersion() {
			StringJoiner version = new StringJoiner(Separators.HARD);
			version.add(identifier.getAsVersion());
			for (SubVersion subVersion : subVersions) {
				version.add(subVersion.getVersion());
			}
			return version.toString();
		}

		@Override
		public SubVersion getSubVersion(int index) {
			return subVersions[index];
		}
	}
}
