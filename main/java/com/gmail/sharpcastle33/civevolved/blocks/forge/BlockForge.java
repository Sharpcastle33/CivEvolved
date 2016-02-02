package com.gmail.sharpcastle33.civevolved.blocks.forge;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockForge extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockForge(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_forgeBlock");
		this.setBlockTextureName("civevolved:forgeBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(2.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
