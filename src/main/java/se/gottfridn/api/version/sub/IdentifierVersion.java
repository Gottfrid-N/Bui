package se.gottfridn.api.version.sub;

import se.gottfridn.api.version.Separators;
import se.gottfridn.api.version.Version;

public record IdentifierVersion(String identifier, boolean stable)
implements Version.Sub{
	@Override
	public String getVersion() {
		if (stable()) {
			return getVersion("stable");
		} else {
			return getVersion("unstable");
		}
	}

	private String getVersion(String stable) {
		return identifier() + Separators.MEDIUM + stable;
	}
}
