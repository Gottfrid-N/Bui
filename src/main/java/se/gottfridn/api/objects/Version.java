package se.gottfridn.api.objects;

@SuppressWarnings("unused")
public record Version(String identifier, boolean stable,
					  String numericalIdentifier, byte major, byte medium, byte minor, char git,
					  String minecraft, String fabricApi, String fabricLoader, String fabricYarn) {
	public static final char SEPARATOR = '|';
	public static final String HARD = "|>";
	public static final char SOFT = '.';
	public String getVerbose() {
		return getIdentifier() + HARD + getNumerical() + HARD + minecraft() + HARD + getFabric();
	}
	public String getIdentifier() {
		if (stable()) {
			return identifier() + SEPARATOR + "stable";
		} else {
			return identifier() + SEPARATOR + "unstable";
		}
	}
	public String getNumerical() {
		return numericalIdentifier() + SEPARATOR + String.valueOf(major()) + SOFT + String.valueOf(medium()) + SOFT +  String.valueOf(minor()) + git();
	}
	public String getFabric() {
		return fabricApi() + SEPARATOR + fabricLoader() + SEPARATOR + fabricYarn();
	}
}
