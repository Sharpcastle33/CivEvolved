package com.gmail.sharpcastle33.civevolved.blocks.forge;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockWorkbench extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockWorkbench(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_workbenchBlock");
		this.setBlockTextureName("civevolved:workbenchBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(2.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
