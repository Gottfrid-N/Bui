package se.gottfridn.api.objects.version.sub;

import se.gottfridn.api.objects.version.Separators;
import se.gottfridn.api.objects.version.Version;

public record Numerical(String identifier, byte major, byte medium, byte minor,
						char git) implements SubVersion {
	@Override
	public String getVersion() {
		return identifier() + Separators.MEDIUM +
				String.valueOf(major()) + Separators.SOFT +
				String.valueOf(medium()) + Separators.SOFT +
				String.valueOf(minor()) + git();
	}
}
