package se.gottfridn.library.version;

public record VersionPart(String part, Separator separator) {
	@Override
	public String toString() {
		return part() + separator().toString();
	}
}
