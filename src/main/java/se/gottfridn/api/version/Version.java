package se.gottfridn.api.version;

public interface Version {
	String getValidVersion();

	String getVerboseVersion();

	SubVersion getSubVersion();
}