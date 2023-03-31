package se.gottfridn.library.identifier;

@SuppressWarnings("unused")
public enum Stability {
	STABLE("stable"),
	DEV("dev"),
	CHAOS("chaos"),
	UNSTABLE("unstable");

	public final String stability;

	Stability(String stability) {
		this.stability = stability;
	}
}
