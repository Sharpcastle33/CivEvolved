package com.gmail.sharpcastle33.civevolved.blocks.ore;

import com.gmail.sharpcastle33.civevolved.main.CivEvolved;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockZincOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockZincOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_zincOreBlock");
		this.setBlockTextureName("civevolved:zincOreBlock");
		this.setCreativeTab(CivEvolved.oreTab);
		//hardness and harvest level
		this.setHardness(2.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
