package com.gmail.sharpcastle33.civevolved.blocks.tanning;

import com.gmail.sharpcastle33.civevolved.main.CivEvolved;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTanningBarrel extends BlockContainer{
	
	public boolean isActive;
	
	public BlockTanningBarrel(){
		super(Material.wood);
		this.setBlockName("civevolved_tanningBarrelBlock");
		this.setBlockTextureName("civevolved:tanningBarrelBlock");
		this.setCreativeTab(CivEvolved.tanningTab);
		this.setHardness(2F);
		this.isActive = false;
	}

	@Override
	public TileEntity createNewTileEntity(World w, int p_149915_2_) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean onBlockActivated(World w, int x, int y, int z){
		//TODO
		return true;
	}
	
	private void dropItem(){
		
	}
	
	public TileEntity createNewTileEntity(World w){
		return new TileTanningRack();
	}

}
