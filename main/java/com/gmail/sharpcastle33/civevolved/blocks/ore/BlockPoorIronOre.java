package com.gmail.sharpcastle33.civevolved.blocks.ore;

import java.util.Random;
import com.gmail.sharpcastle33.civevolved.main.CivEvolved;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockPoorIronOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockPoorIronOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_ironPoorOreBlock");
		this.setBlockTextureName("civevolved:ironPoorOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(2.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
	//
	public Item getItemDropped(int meta, Random random, int fortune){
		return CivEvolved.ironSmallChunk;
	}
	
	public int damageDropped(int metadata){
		return 0;
	}
	public int quantityDropped(int meta, int fortune, Random random){
		return 1;
	}
}
