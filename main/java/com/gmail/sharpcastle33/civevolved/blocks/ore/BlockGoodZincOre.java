package com.gmail.sharpcastle33.civevolved.blocks.ore;

import com.gmail.sharpcastle33.civevolved.main.CivEvolved;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
public class BlockGoodZincOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockGoodZincOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_zincGoodOreBlock");
		this.setBlockTextureName("civevolved:zincGoodOreBlock");
		this.setCreativeTab(CivEvolved.oreTab);
		//hardness and harvest level
		this.setHardness(3.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
