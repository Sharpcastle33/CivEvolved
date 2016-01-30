package com.gmail.sharpcastle33.civevolved.blocks.ore;

import java.util.Random;

import com.gmail.sharpcastle33.civevolved.main.CivEvolved;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockIronOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockIronOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_ironOreBlock");
		this.setBlockTextureName("civevolved:ironOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(4.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
	
	public Item getItemDropped(int meta, Random random, int fortune){
		return CivEvolved.ironChunk;
	}
	
	public int damageDropped(int metadata){
		return 0;
	}
	public int quantityDropped(int meta, int fortune, Random random){
		return 1;
	}
}
