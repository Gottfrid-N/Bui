package se.gottfrid_n.api.objects;

public record Version(String identifier, boolean stable,
					  String stage, String subStages,
					  String fabric, String minecraft) {
	@Override
	public String toString() {
		if(!stable) {
			return identifier+"|"+"unstable"+"|>"+stage+"|"+subStages+"|>"+fabric+"|"+minecraft;
		}
		return identifier+"|"+"stable"+"|>"+stage+"|"+subStages+"|>"+fabric+"|"+minecraft;
	}
}
