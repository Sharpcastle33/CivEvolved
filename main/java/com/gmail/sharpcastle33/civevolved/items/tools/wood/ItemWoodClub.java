package com.gmail.sharpcastle33.civevolved.items.tools.wood;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.gmail.sharpcastle33.civevolved.items.tools.types.ItemClub;
import com.gmail.sharpcastle33.civevolved.main.CivEvolved;

import net.minecraft.init.Blocks;

public class ItemWoodClub extends ItemClub{

	//static Object[] effectiveBlocks = {};
	static Set<Blocks> eff = new HashSet<Blocks>();
	
	public ItemWoodClub() {
		super(8F, CivEvolved.WOODEN_CLUB, eff);
		// TODO Auto-generated constructor stub
	}

}
