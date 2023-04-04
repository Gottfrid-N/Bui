package se.gottfridn.library.identifier;

/**
 * This enum contains {@code levels} of {@code stability} for {@link ModIdentifier}
 * <p>
 *     Each constant contains a {@link String} of its name
 * </p>
 *
 * @see ModIdentifier
 */


public enum Stability {
	/**
	 * This {@code level} should be used when a {@code mod} is stable and released.
	 */
	RELEASED("stable"),

	/**
	 * This {@code level} should be used when a {@code mod} is in development and stable.
	 * <p>
	 *     If a {@code mod} is unstable / chaotic you should use {@link Stability#CHAOS} and {@link Stability#UNSTABLE}
	 * </p>
	 */
	DEVELOPMENT("dev"),

	/**
	 * This {@code level} should be used when a {@code mod} is unstable, but doesn't crash.
	 * <p>
	 *     This should also be used when a {@code mod} has a lot of warnings.
	 * </p>
	 */
	CHAOS("chaos"),

	/**
	 * This {@code level} should be used when a {@code mod} is unstable.
	 */
	UNSTABLE("unstable");

	private final String stability;

	Stability(String stability) {
		this.stability = stability;
	}

	@Override
	public String toString() {
		return stability;
	}
}
