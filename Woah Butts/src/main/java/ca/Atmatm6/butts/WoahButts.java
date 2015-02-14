package ca.Atmatm6.butts;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import static ca.Atmatm6.butts.BootyReference.*;

@Mod(modid = bootid, name = bootname, version = bootver)
public class WoahButts {
    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent preInitializationEvent) {
        BootyReference.morphInstalled = Loader.isModLoaded("Morph");
        if(morphInstalled.equals(true))
        {
            ;
        }
    }
}
