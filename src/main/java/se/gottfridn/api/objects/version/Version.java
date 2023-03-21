package se.gottfridn.api.objects.version;

import se.gottfridn.api.objects.version.sub.SubVersion;

public record Version(SubVersion[] subVersions) {
	public String getVerbose() {
		for(SubVersion subVersion : subVersions()) {

		}
	}
}

