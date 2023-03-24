package se.gottfridn.api.mod.logger;

/**
 * The {@code EncapsulatedLogger} interface contains encapsulated logging methods that can be used to log messages with various levels of severity.
 * <p>Messages logged using this interface should follow {@code slf4j} format.</p>
 *
 * @implSpec Implementations are expected to use the {@code slf4j} library to log.
 * @implNote Implementations should provide a way to configure the behaviour.
 */

@SuppressWarnings("unused")
public interface EncapsulatedLogger {
	/**
	 * Logs a {@code String} using {@link org.slf4j.Logger#info} method.
	 *
	 * @param info The {@code String} to log.
	 */
	void info(String info);

	/**
	 * Logs a {@code String} using {@link org.slf4j.Logger#debug} method that will only be visible in {@code debug.log}.
	 *
	 * @param debug The {@code String} to log.
	 * @see EncapsulatedLogger#info
	 */
	void debug(String debug);

	/**
	 * Logs a {@code String} using {@link org.slf4j.Logger#warn} method that will be indicated as orange in the log.
	 *
	 * @param warning The {@code String} to log.
	 * @see EncapsulatedLogger#warning(String, Throwable)
	 */
	void warning(String warning);

	/**
	 * Logs a {@code String} and throws a {@code Throwable} using {@link org.slf4j.Logger#warn} method that will be indicated as orange in the log.
	 *
	 * @param warning The {@code String} to log.
	 * @param throwable The {@code Throwable} to throw.
	 */
	void warning(String warning, Throwable throwable);

	/**
	 * Logs a {@code String} using {@link org.slf4j.Logger#error} method that will be indicated as red in the log.
	 *
	 * @param error The {@code String} to log.
	 * @see EncapsulatedLogger#error(String, Throwable)
	 */
	void error(String error);

	/**
	 * Logs a {@code String} and throws a {@code Throwable} using {@link org.slf4j.Logger#error} method that will be indicated as red in the log.
	 *
	 * @param error The {@code String} to log.
	 * @param throwable The {@code Throwable} to throw.
	 */
	void error(String error, Throwable throwable);
}
