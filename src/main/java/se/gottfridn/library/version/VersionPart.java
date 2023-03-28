package se.gottfridn.library.version;

public class VersionPart {
	public final String part;
	public final Separator separator;

	public VersionPart(String part, Separator separator) {
		this.part = part;
		this.separator = separator;
	}
}
