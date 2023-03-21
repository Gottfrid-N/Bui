package se.gottfridn.api.objects.version.sub;

import se.gottfridn.api.objects.version.Separators;
import se.gottfridn.api.objects.version.Version;

public record Fabric(String fabricApi, String fabricLoader, String fabricYarn) implements SubVersion {
	@Override
	public String getVersion() {
		return fabricApi() + Separators.MEDIUM +
				fabricLoader() + Separators.MEDIUM +
				fabricYarn();
	}
}
