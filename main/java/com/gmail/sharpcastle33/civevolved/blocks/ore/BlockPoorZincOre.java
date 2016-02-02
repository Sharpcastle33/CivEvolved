package com.gmail.sharpcastle33.civevolved.blocks.ore;

import com.gmail.sharpcastle33.civevolved.main.CivEvolved;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPoorZincOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockPoorZincOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_zincPoorOreBlock");
		this.setBlockTextureName("civevolved:zincPoorOreBlock");
		this.setCreativeTab(CivEvolved.oreTab);
		//hardness and harvest level
		this.setHardness(1.5f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
