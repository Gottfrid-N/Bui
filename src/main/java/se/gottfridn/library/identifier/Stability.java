package se.gottfridn.library.identifier;

public enum Stability {
	STABLE("stable"), DEV("dev"),
	CHAOS("chaos"),
	UNSTABLE("unstable");

	public final String stability;

	Stability(String stability) {
		this.stability = stability;
	}
}
