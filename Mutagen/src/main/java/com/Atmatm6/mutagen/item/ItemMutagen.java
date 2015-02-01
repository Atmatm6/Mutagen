package com.Atmatm6.mutagen.item;

import com.Atmatm6.mutagen.Mutagen;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import java.util.List;
//TODO: Setup description and in-item furnace EDIT: Everything is a mess...
public class ItemMutagen extends Item{
    public List dflol;
    private final ResourceLocation namer = new ResourceLocation("");
    private final String name = "itemMutagen";
    public ItemMutagen()
    {
        super();
        this.setUnlocalizedName(Mutagen.modid + ":" + name);
        this.setCreativeTab(Mutagen.tabMutagen);
//      this.addInformation(ItemStack,EntityPlayer,dflol,true);
    }
    }
/*    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean par4)
    {
        dflol.add("Used to start everything in this mod.");
    }
*/
