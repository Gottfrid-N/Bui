package se.gottfridn.api.mod.identifier;

/**
 * The {@code ModIdentifier} interface represents a unique identifier for a mod.
 *
 * <p>A {@code ModIdentifier} consists of two parts: a {@code name} and an {@code id}.
 * The {@code name} is a human-readable {@link String},
 * while the {@code id} is used to identify the mod in code.</p>
 *
 * @implSpec <p>The {@code id} is expected to be in {@literal snake_case}</p>
 */

@SuppressWarnings("unused")
public interface ModIdentifier {

	/**
	 * @return The name of the mod as a {@code String}
	 */
	String getName();

	/**
	 * @return The id of the mod as a {@code String} in {@literal snake_case}
	 */
	String getId();
}
