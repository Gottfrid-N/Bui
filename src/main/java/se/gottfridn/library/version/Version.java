package se.gottfridn.library.version;

public interface Version {
	String getValidVersion();

	String getVerboseVersion();

	SubVersion getSubVersion();
}