package com.gmail.sharpcastle33.civevolved.blocks.tanning;

import com.gmail.sharpcastle33.civevolved.main.CivEvolved;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTanningRack extends BlockContainer{
	
	public boolean isActive;
	
	public BlockTanningRack(){
		super(Material.wood);
		this.setBlockName("civevolved_tanningRackBlock");
		this.setBlockTextureName("civevolved:tanningRackBlock");
		this.setCreativeTab(CivEvolved.tanningTab);
		this.setHardness(2F);
		this.isActive = false;
	}

	@Override
	public TileEntity createNewTileEntity(World w, int p_149915_2_) {
		// TODO Auto-generated method stub
		return null;
	}

}
