package anime.tutorial.main;

import java.util.logging.Logger;

import anime.tutorial.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class MinecraftAnime {
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	public static MinecraftAnime instance;

	public static Logger logger;

@EventHandler
public void preInit(FMLPreInitializationEvent event) {
	proxy.preInit(event);
}
@EventHandler
public void Init(FMLInitializationEvent event) {
	proxy.Init(event);
}
@EventHandler
public void postInit(FMLPostInitializationEvent event) {
	proxy.postInit(event);
	}
}