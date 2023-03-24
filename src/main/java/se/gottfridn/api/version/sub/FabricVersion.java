package se.gottfridn.api.version.sub;

import se.gottfridn.api.version.Separators;
import se.gottfridn.api.version.Version;

public record FabricVersion(String fabricApi, String fabricLoader, String fabricYarn)
	implements Version.Sub {
	@Override
	public String getVersion() {
		return fabricApi() + Separators.MEDIUM + fabricLoader() + Separators.MEDIUM + fabricYarn();
	}
}
