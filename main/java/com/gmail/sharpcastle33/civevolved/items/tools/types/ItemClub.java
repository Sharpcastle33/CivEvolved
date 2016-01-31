package com.gmail.sharpcastle33.civevolved.items.tools.types;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.block.Block;
<<<<<<< HEAD
=======
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
>>>>>>> origin/master
import net.minecraft.item.ItemTool;

public class ItemClub extends ItemTool{

	public static final Block[] blocksEffectiveAgainst = {};
	static Set<Blocks> eff = new HashSet<Blocks>();

	public ItemClub(float p_i45333_1_, ToolMaterial mat, Set blocks) {
		super(2F, mat, blocks);
		
		//this.setMaxDamage(2F);
		// TODO Auto-generated constructor stub
	}

	public ItemClub(ToolMaterial enumToolMaterial) {
		super(2F,enumToolMaterial,eff);
	}


}
