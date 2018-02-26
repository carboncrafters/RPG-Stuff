package ml.emalm.sandbox.rpgstuff;

import ml.emalm.sandbox.rpgstuff.proxy.CommonProxy;
import ml.emalm.sandbox.rpgstuff.tab.CreativeTabRPGStuff;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RpgStuff.MODID, version = RpgStuff.VERSION, name = RpgStuff.NAME)
public class RpgStuff {
    public static final String MODID = "rpgstuff";
    public static final String VERSION = "0.0";
    public static final String NAME = "RPG Stuff";


    @SidedProxy(clientSide = "ml.emalm.sandbox.rpgstuff.proxy.ClientProxy", serverSide = "ml.emalm.sandbox.rpgstuff.proxy.CommonProxy")
    public  static CommonProxy proxy;

    @Mod.Instance
    public static RpgStuff instance;

    public static CreativeTabRPGStuff tabRPGStuff;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        tabRPGStuff = new CreativeTabRPGStuff(CreativeTabs.getNextID(), "RPG-Stuff");
        proxy.preinit(event);

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);

    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {

        proxy.postinit(event);

    }
}
