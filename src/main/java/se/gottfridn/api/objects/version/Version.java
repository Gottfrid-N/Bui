package se.gottfridn.api.objects.version;

public record Version(Version.Identifier identifier, Version.Numerical numerical, Version.Fabric fabric) {

	public String getVerbose() {
		return identifier().getVersion() + Separators.HARD + numerical().getVersion() + Separators.HARD + Separators.HARD + fabric().getVersion();
	}

	public record Fabric(String fabricApi, String fabricLoader, String fabricYarn) {
		public String getVersion() {
			return fabricApi() + Separators.MEDIUM +
					fabricLoader() + Separators.MEDIUM +
					fabricYarn();
		}
	}
	public record Identifier(String identifier, boolean stable) {
		public String getVersion() {
			if (stable()) {
				return getVersion("stable");
			} else {
				return getVersion("unstable");
			}
		}
		private String getVersion(String stable) {
			return identifier() + Separators.MEDIUM +
					stable;
		}
	}
	public record Numerical(String identifier, byte major, byte medium, byte minor, char git) {
		public String getVersion() {
			return identifier() + Separators.MEDIUM +
					String.valueOf(major()) + Separators.SOFT +
					String.valueOf(medium()) + Separators.SOFT +
					String.valueOf(minor()) + git();
		}
	}
}
