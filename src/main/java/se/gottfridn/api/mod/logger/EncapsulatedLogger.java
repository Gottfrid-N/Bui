package se.gottfridn.api.mod.logger;

public interface EncapsulatedLogger {
	void info(String info);

	void debug(String debug);

	void warning(String warning);

	void warning(String warning, Throwable throwable);

	void error(String error);

	void error(String error, Throwable throwable);
}
