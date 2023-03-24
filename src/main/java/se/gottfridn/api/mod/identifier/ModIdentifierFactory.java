package se.gottfridn.api.mod.identifier;


/**
 *
 */
public class ModIdentifierFactory {
	/**
	 * @param name
	 * @return
	 */
	public static ModIdentifier createIdentifier(String name) {
		return new ModIdentifier() {
			final String id = name.toLowerCase().replaceAll("[a-z0-9_]", "_").replaceAll("_+", "_");
			@Override
			public String id() {
				return id;
			}

			@Override
			public String name() {
				return name;
			}
		};
	}

	public static ModIdentifier createIdentifier(String name, String id) {
		return new ModIdentifier() {
			@Override
			public String id() {
				return id;
			}

			@Override
			public String name() {
				return name;
			}
		};
	}
}
