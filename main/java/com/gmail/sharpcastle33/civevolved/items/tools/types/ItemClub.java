package com.gmail.sharpcastle33.civevolved.items.tools.types;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemTool;

public class ItemClub extends ItemTool{

	public static final Block[] blocksEffectiveAgainst = {};

	public ItemClub(float p_i45333_1_, ToolMaterial mat, Set blocks) {
		super(2F, mat, blocks);
		this.setUnlocalizedName("civevolved_woodClub");
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName("civevolved:woodClub");
		
		//this.setMaxDamage(2F);
		// TODO Auto-generated constructor stub
	}


}
