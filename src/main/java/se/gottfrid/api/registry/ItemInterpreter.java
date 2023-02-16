package se.gottfrid.api.registry;

import se.gottfrid.api.registry.elements.RegistryItem;

public interface ItemInterpreter extends RegistryInterpreter {
	void itemInterpreter(RegistryItem item, String stage);
}
