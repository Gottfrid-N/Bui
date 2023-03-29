package se.gottfridn.library.version;

public interface Version
	extends VersionFormat{
	SubVersion[] getSubVersions();
}
