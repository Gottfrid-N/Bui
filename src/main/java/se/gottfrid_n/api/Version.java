package se.gottfrid_n.api;

public record Version(String identifier, String danger, String stage, String subStages, String fabric, String minecraft) {
	public String toString() {
		return identifier+"|"+danger+"|>"+stage+"|"+subStages+"|>"+fabric+"|"+minecraft;
	}
}
