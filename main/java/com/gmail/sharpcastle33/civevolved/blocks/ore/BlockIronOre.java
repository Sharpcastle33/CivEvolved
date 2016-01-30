package com.gmail.sharpcastle33.civevolved.blocks.ore;

import java.util.ArrayList;

import com.gmail.sharpcastle33.civevolved.main.CivEvolved;
import com.gmail.sharpcastle33.civevolved.util.Util;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

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

	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune){
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		drops.add(new ItemStack(CivEvolved.ironChunk,1));
		if(Util.chance(90)){
			drops.add(new ItemStack(CivEvolved.ironSmallChunk));
		}
		return drops;
	}
}
