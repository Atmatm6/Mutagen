package com.Atmatm6.mutagen;

import com.Atmatm6.mutagen.block.MutaOre;
import com.Atmatm6.mutagen.item.ItemMutagen;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Mutagen.modid, name = "Mutagen Core", version = "1.7.10")
public class Mutagen {
    public static CreativeTabs tabMutagen = new CreativeTabs(17, "Mutagen") {
        @Override
        public Item getTabIconItem() {
            return Items.brewing_stand;
        }
    };
    public static final String modid = "mutate";
    Item itemMutagen = new ItemMutagen();
    Block MutaOre = new MutaOre(Material.circuits);

    public void preInit(FMLPreInitializationEvent event)
    {
        GameRegistry.registerItem(itemMutagen, "Mutagen");
        GameRegistry.registerBlock(MutaOre, "Mutagen Ore");
    }
}
