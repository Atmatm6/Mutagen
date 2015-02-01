package com.Atmatm6.mutagen.block;

import com.Atmatm6.mutagen.Mutagen;
import net.minecraft.block.material.Material;

public class MutaOre extends BlockMut{
    public MutaOre(Material material) {
        super(material);
        setCreativeTab(Mutagen.tabMutagen);
    }
}
