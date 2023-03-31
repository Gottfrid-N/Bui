package se.gottfridn.library.logger;

/**
 * This interface contains encapsulated logging methods that can be used to log {@code String} messages with various levels of severity.
 * @implSpec Implementations are expected to use the {@link org.slf4j.Logger}.
 * @implNote Implementations should provide a way to configure the behaviour.
 *
 * @see org.slf4j.Logger
 */

@SuppressWarnings("unused")
public interface EncapsulatedLogger {
	/**
	 * Logs the given {@code String}
	 *
	 * @param info The {@code String} to be logged.
	 */
	void info(String info);

	/**
	 * Logs the given {@code String}.
	 *
	 * @param debug The {@code String} to be logged.
	 * @see EncapsulatedLogger#info
	 */
	void debug(String debug);

	/**
	 * Logs the given {@code String}.
	 *
	 * @param warning The {@code String} to be logged.
	 * @see EncapsulatedLogger#warning(String, Throwable)
	 */
	void warning(String warning);

	/**
	 * Logs the given {@code String} and throws a {@code Throwable}.
	 *
	 * @param warning The {@code String} to be logged.
	 * @param throwable The {@code Throwable} to be thrown.
	 *
	 * @see EncapsulatedLogger#warning(String)
	 */
	void warning(String warning, Throwable throwable);

	/**
	 * Logs the given {@code String}.
	 *
	 * @param error The {@code String} to be logged.
	 * @see EncapsulatedLogger#error(String, Throwable)
	 */
	void error(String error);

	/**
	 * Logs the given {@code String} and throws a {@code Throwable}.
	 *
	 * @param error The {@code String} to be logged.
	 * @param throwable The {@code Throwable} to be thrown.
	 *
	 * @see EncapsulatedLogger#error(String)
	 */
	void error(String error, Throwable throwable);
}
