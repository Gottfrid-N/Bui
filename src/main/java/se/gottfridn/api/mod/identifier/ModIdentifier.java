package se.gottfridn.api.mod.identifier;

public interface ModIdentifier {
	String getName();

	String getIdentifier();

	class Factory
			implements ModIdentifier {

		private final String name;

		public Factory(String name) {
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public String getIdentifier() {
			return name.toLowerCase();
		}
	}
}
