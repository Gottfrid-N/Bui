package se.gottfrid_n.api;

public record Version(String identifier, String stage, String danger, String subStages, String fabric) {
	public String toString() {
		return identifier+"/"+danger+"|>"+stage+"-"+subStages+"|>"+fabric;
	}
}
