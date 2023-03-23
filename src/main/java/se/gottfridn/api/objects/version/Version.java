package se.gottfridn.api.objects.version;

import java.util.StringJoiner;

public record Version(Version.Sub[] subVersions) {
	public String getVerbose() {
		StringJoiner version = new StringJoiner("");
		for (Version.Sub subVersion : subVersions()) {
			version.add(subVersion.getVersion() + Separators.HARD);
		}
		return version.toString().substring(0, version.length() - 2);
	}
	public String getSubVersion(int index) {
		return subVersions[index].getVersion();
	}
	public interface Sub {
		String getVersion();
	}
}

