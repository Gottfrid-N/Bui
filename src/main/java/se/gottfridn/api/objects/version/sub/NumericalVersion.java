package se.gottfridn.api.objects.version.sub;

import se.gottfridn.api.objects.version.Separators;
import se.gottfridn.api.objects.version.Version;

public record NumericalVersion(String numericalIdentifier, int major, int medium, int minor, char git)
		implements Version.Sub {
	@Override
	public String getVersion() {
		return numericalIdentifier() + Separators.MEDIUM +
				major() + Separators.SOFT +
				medium() + Separators.SOFT +
				minor() + git();
	}
}
