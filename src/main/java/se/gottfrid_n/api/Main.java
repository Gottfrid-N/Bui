package se.gottfrid_n.api;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	public final String identifier;
	public final String name;
	public final String version;
	public final boolean log;
	public final Logger logger;
	public Main(String identifier, String name, boolean log, Version version) {
		this.identifier = identifier;
		this.name = name;
		this.log = log;
		this.version = version.toString();
		this.logger = LoggerFactory.getLogger(this.name);
	}
	public void logRegister(String id, String type) {
		this.logger.info("Registering: "+this.identifier+":"+type+"/"+id);
	}
	public void logStage(String stage) {
		this.logger.info("Registering Stage: "+stage);
	}
	public void logToItemGroup(Item item, ItemGroup itemGroup) {
		this.logger.info("Sending "+item.toString()+" to "+itemGroup.getDisplayName());
	}


}
