package se.gottfridn.api.objects.version.sub;

import se.gottfridn.api.objects.version.Separators;
import se.gottfridn.api.objects.version.Version;

public record FabricVersion(String fabricApi, String fabricLoader, String fabricYarn)
	implements Version.Sub {

	@Override
	public String getVersion() {
		return fabricApi() + Separators.MEDIUM + fabricLoader() + Separators.MEDIUM + fabricYarn();
	}

}
