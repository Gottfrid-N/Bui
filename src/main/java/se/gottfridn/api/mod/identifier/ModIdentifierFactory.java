package se.gottfridn.api.mod.identifier;


import se.gottfridn.api.mod.logger.EncapsulatedLogger;
import se.gottfridn.api.mod.logger.EncapsulatedLoggerFactory;

/**
 *	The {@code ModIdentifierFactory} class is a factory for creating instances of {@code ModIdentifier}.
 *
 * <p>The class provides the static methods
 * {@link ModIdentifierFactory#getIdentifier(String)} and
 * {@link ModIdentifierFactory#getIdentifier(String, String)}
 * for creating instances of {@code ModIdentifier} with specified {@code String} name (and id).</p>
 *
 * <p>Usage example:
 * <blockquote><pre>
 * ModIdentifier identifier = ModIdentifierFactory.getIdentifier("name");
 * String id = identifier.getId();
 * String name = identifier.getName();
 * </pre></blockquote>
 * or:
 * <blockquote><pre>
 * ModIdentifier identifier = ModIdentifierFactory.getIdentifier("name", "weirdly_different_id");
 * String id = identifier.getId();
 * String name = identifier.getName();}
 * </pre></blockquote></p>
 *
 * @see ModIdentifier
 * @see ModIdentifierFactory#getIdentifier(String)
 * @see ModIdentifierFactory#getIdentifier(String, String)
 */

@SuppressWarnings("unused")
public class ModIdentifierFactory {
	private static final EncapsulatedLogger logger = EncapsulatedLoggerFactory.getLogger("mod_identifier_factory", true, false);

	/**
	 * Returns a
	 * @param name
	 * @return A new instance of {@link ModIdentifier} with the specified {@code name} and automatically generated id that follows snake_case convention.
	 */
	public static ModIdentifier getIdentifier(String name) {
		final String id = name.toLowerCase().replaceAll("[^a-zA-Z0-9_]+", "_").replaceAll("_+", "_");
		return new ModIdentifierImplementation(name, id);
	}

	public static ModIdentifier getIdentifier(String name, String id) {
		if (!id.matches("^[a-z0-9]+(_[a-z0-9]+)*$")) {
			logger.error("Invalid id: " + id, new IllegalArgumentException());
		}
		return new ModIdentifierImplementation(name, id);
	}
	public static final class ModIdentifierImplementation
		implements ModIdentifier{
		private final String name;
		private final String id;

		public ModIdentifierImplementation(String name, String id) {
			this.name = name;
			this.id = id;
		}

		@Override
		public String getId() {
			return id;
		}

		@Override
		public String getName() {
			return name;
		}
	}
}
