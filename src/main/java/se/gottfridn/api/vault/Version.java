package se.gottfridn.api.vault;

/**
 *	The {@code Version} interface
 */
@SuppressWarnings("unused")
public interface Version {
	String getSubVersion(int index);

	String getVerboseVersion();

	String getVersion();
}
