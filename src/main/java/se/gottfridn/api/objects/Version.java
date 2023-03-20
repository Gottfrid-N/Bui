package se.gottfridn.api.objects;

public class Version {
	public final String identifier; public final boolean stable;
	public final String stage; 		public final String subStages;
	public final String fabric; 	public final String minecraft;
	public Version(String identifier, boolean stable,
				   String stage, String subStages,
				   String fabric, String minecraft) {
		this.identifier = identifier; 	this.stable = stable;
		this.stage = stage; 			this.subStages = subStages;
		this.fabric = fabric; 			this.minecraft = minecraft;
	}
	@Override
	public String toString() {
		if(!stable) {
			return identifier+"|"+"unstable"+"|>"+stage+"|"+subStages+"|>"+fabric+"|"+minecraft;
		}
		return identifier+"|"+"stable"+"|>"+stage+"|"+subStages+"|>"+fabric+"|"+minecraft;
	}
}
