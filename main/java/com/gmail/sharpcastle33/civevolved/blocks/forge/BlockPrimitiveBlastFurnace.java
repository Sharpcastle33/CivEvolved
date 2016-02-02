package com.gmail.sharpcastle33.civevolved.blocks.forge;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPrimitiveBlastFurnace extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockPrimitiveBlastFurnace(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_primitiveBlackFurnaceBlock");
		this.setBlockTextureName("civevolved:primitiveBlastFurnaceBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(2.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
