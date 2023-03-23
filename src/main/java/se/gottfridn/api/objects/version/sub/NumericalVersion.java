package se.gottfridn.api.objects.version.sub;

import se.gottfridn.api.objects.version.Separators;
import se.gottfridn.api.objects.version.Version;

import java.util.StringJoiner;

public record NumericalVersion(String numericalIdentifier, int[] numerical, char git)
		implements Version.Sub {
	@Override
	public String getVersion() {
		StringJoiner version = new StringJoiner("");
		for (int number : numerical()) {
			version.add(String.valueOf(number) + Separators.SOFT);
		}
		return numericalIdentifier() + Separators.MEDIUM +
				version
				+ git();
	}
}
