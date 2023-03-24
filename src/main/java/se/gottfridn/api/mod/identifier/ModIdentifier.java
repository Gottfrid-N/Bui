package se.gottfridn.api.mod.identifier;

/**
 * The {@code ModIdentifier} interface represents a unique identifier for a mod.
 *
 * <p>A ModIdentifier consists of two parts: a name and an id. The name is a human-readable string, while the id is used to identify the mod in code.</p>
 *
 * @implNote Usually the id is the name in snake_case.
 */

@SuppressWarnings("unused")
public interface ModIdentifier {

	/**
	 * @return The name of the mod as a {@code String}
	 */
	String name();

	/**
	 * @return The id of the mod as a {@code String}
	 */
	String id();
}
