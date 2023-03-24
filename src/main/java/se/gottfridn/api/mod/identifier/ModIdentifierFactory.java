package se.gottfridn.api.mod.identifier;

public record ModIdentifierFactory(String name)
		implements ModIdentifier {
	@Override
	public String id() {
		return name.toLowerCase();
	}
}
