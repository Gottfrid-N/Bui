package se.gottfridn.library.version;

import se.gottfridn.library.identifier.ModIdentifier;

import java.util.StringJoiner;

public class VersionFactory {
	public static Version getVersion(ModIdentifier identifier, SubVersion[] subVersions) {
		return new VersionImplementation(subVersions);
	}

	public static Version getVersion(SubVersion[] subVersions) {
		return new VersionImplementation(subVersions);
	}

	static final class VersionImplementation
		implements Version {
		private final SubVersion[] subVersions;

		public VersionImplementation(SubVersion[] subVersions) {
			this.subVersions = subVersions;
		}
		@Override
		public SubVersion[] getSubVersions() {
			return subVersions;
		}

		@Override
		public String toVersionFormat() {
			@SuppressWarnings("all")
			StringJoiner joiner = new StringJoiner(Separator.HARD.toString());
			for (SubVersion subVersion : subVersions) {
				joiner.add(subVersion.toVersionFormat());
			}
			return joiner.toString();
		}
	}
}
