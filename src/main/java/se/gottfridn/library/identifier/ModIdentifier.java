package se.gottfridn.library.identifier;

/**
 * This interface represents a unique identifier for a mod.
 *	<p>
 *	   A {@code ModIdentifier} contains three parts: a {@code name}, {@code id} and {@code stability}.
 *	</p>
 *
 *
 * @implSpec The {@code id} is expected to be returned in {@literal snake_case}
 * @implNote The {@code stability} should use the {@link Stability} enum for its levels.
 *
 * @see Stability
 */

@SuppressWarnings("unused")
public interface ModIdentifier {
	/**
	 * Gets the {@code name} of the mod.
	 *
	 * @return The {@code name} of the mod as a {@code String}
	 */
	String getName();

	/**
	 * Gets the {@code id} of the mod.
	 *
	 * @return The {@code id} of the mod as a {@link String} in {@literal snake_case}
	 */
	String getId();

	/**
	 * Gets the {@code stability} of the mod as a string.
	 *
	 * @return The {@code id} of the mod as a {@link String} in {@literal snake_case}
	 */
	String getStability();
}
