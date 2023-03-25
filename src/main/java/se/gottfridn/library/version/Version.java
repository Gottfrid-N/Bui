package se.gottfridn.library.version;

public interface Version {
	String getVersion();

	SubVersion getSubVersion(int index);
}
