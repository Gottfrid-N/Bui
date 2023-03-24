package se.gottfridn.api.mod.identifier;


/**
 *	The {@code ModIdentifierFactory} class is a factory for creating instances of {@code ModIdentifier}.
 *
 * <p>The class provides the static methods
 * {@link ModIdentifierFactory#createIdentifier(String)} and
 * {@link ModIdentifierFactory#createIdentifier(String, String)}
 * for creating instances of {@code ModIdentifier} with specified Name (and id).</p>
 *
 * <p>Usage example:
 * <pre>{@code
 * ModIdentifier identifier = ModIdentifierFactory.createIdentifier("name");
 * String id = identifier.getId();
 * String name = identifier.getName();}
 * </pre>or:<pre>{@code
 * ModIdentifier identifier = ModIdentifierFactory.createIdentifier("name", "weirdly_different_id");
 * String id = identifier.getId();
 * String name = identifier.getName();}</pre></p>
 *
 * @see ModIdentifier
 * @see ModIdentifierFactory#createIdentifier(String)
 * @see ModIdentifierFactory#createIdentifier(String, String)
 */

@SuppressWarnings("unused")
public class ModIdentifierFactory {
	/**
	 * @param name
	 * @return
	 */
	public static ModIdentifier createIdentifier(String name) {
		return new ModIdentifier() {
			final String id = name.toLowerCase().replaceAll("[a-z0-9_]", "_").replaceAll("_+", "_");
			@Override
			public String getId() {
				return id;
			}

			@Override
			public String getName() {
				return name;
			}
		};
	}

	public static ModIdentifier createIdentifier(String name, String id) {
		return new ModIdentifier() {
			@Override
			public String getId() {
				return id;
			}

			@Override
			public String getName() {
				return name;
			}
		};
	}
}
