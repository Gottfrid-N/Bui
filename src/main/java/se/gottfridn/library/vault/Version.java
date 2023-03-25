package se.gottfridn.library.vault;

/**
 *	The {@code Version} interface
 */
@SuppressWarnings("unused")
public interface Version {
	String getSubVersion(int index);

	String getVerboseVersion();

	String getVersion();
}
