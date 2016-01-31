package com.gmail.sharpcastle33.civevolved.blocks.ore;

import java.util.ArrayList;

import com.gmail.sharpcastle33.civevolved.main.CivEvolved;
import com.gmail.sharpcastle33.civevolved.util.Util;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockGoodIronOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockGoodIronOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_ironGoodOreBlock");
		this.setBlockTextureName("civevolved:ironGoodOreBlock");
		this.setCreativeTab(CivEvolved.oreTab);
		//hardness and harvest level
		this.setHardness(6.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
	
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune){
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		drops.add(new ItemStack(CivEvolved.ironLargeChunk,1));
		if(Util.chance(10)){
			drops.add(new ItemStack(CivEvolved.ironChunk));
		}
		if(Util.chance(30)){
			drops.add(new ItemStack(CivEvolved.ironSmallChunk, Util.randInt(1, 3)));
		}
		return drops;
	}
}
