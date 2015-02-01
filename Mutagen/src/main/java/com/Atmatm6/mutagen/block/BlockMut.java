package com.Atmatm6.mutagen.block;

import com.Atmatm6.mutagen.Mutagen;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMut extends Block{
    protected BlockMut(Material material) {
        super(Material.circuits);
        this.setCreativeTab(Mutagen.tabMutagen);
    }
}
