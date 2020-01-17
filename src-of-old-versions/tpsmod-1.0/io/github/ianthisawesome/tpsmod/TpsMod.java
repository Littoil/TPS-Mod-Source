package io.github.ianthisawesome.tpsmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
		modid = "tpsmod",
		version = "1.0"
)
public class TpsMod
{
	public static final String MODID = "tpsmod";
	public static final String VERSION = "1.0";
	private static final Logger LOGGER = LogManager.getLogger();
	public static WorldLogger theWorldLogger;

	@EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		LOGGER.info("[TPS Mod]: Preinit");
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		LOGGER.info("[TPS Mod]: Init");
		theWorldLogger = new WorldLogger("World Logger");
		theWorldLogger.start();
	}

	@EventHandler
	public void postinit(FMLPostInitializationEvent event)
	{
		LOGGER.info("[TPS Mod]: Postinit");
	}
}