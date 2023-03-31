package se.gottfridn.library.version;

public record VersionPart(String part, Separator separator)
	implements VersionFormat {
	@Override
	public String toVersionFormat() {
		return part() + separator().toString();
	}
}
