package se.gottfridn.api.mod.logger;

/**
 * The {@code EncapsulatedLogger} interface contains encapsulated logging methods that can be used to log {@code String} messages with various levels of severity.
 * <p>Messages logged using this interface should follow {@code slf4j} format.</p>
 *
 * @implSpec Implementations are expected to use the {@link org.slf4j.Logger} library to log.
 * @implNote Implementations should provide a way to configure the behaviour.
 *
 * @see org.slf4j.Logger
 */

@SuppressWarnings("unused")
public interface EncapsulatedLogger {
	/**
	 * Logs a {@code String}
	 *
	 * @param info The {@code String} to be logged.
	 */
	void info(String info);

	/**
	 * Logs a {@code String}.
	 *
	 * @param debug The {@code String} to be logged.
	 * @see EncapsulatedLogger#info
	 */
	void debug(String debug);

	/**
	 * Logs a {@code String}.
	 *
	 * @param warning The {@code String} to be logged.
	 * @see EncapsulatedLogger#warning(String, Throwable)
	 */
	void warning(String warning);

	/**
	 * Logs a {@code String} and throws a {@code Throwable}.
	 *
	 * @param warning The {@code String} to be logged.
	 * @param throwable The {@code Throwable} to be thrown.
	 */
	void warning(String warning, Throwable throwable);

	/**
	 * Logs a {@code String}.
	 *
	 * @param error The {@code String} to be logged.
	 * @see EncapsulatedLogger#error(String, Throwable)
	 */
	void error(String error);

	/**
	 * Logs a {@code String} and throws a {@code Throwable}.
	 *
	 * @param error The {@code String} to be logged.
	 * @param throwable The {@code Throwable} to be thrown.
	 */
	void error(String error, Throwable throwable);
}
