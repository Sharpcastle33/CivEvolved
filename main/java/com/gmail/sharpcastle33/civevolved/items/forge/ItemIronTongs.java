package com.gmail.sharpcastle33.civevolved.items.forge;

import com.gmail.sharpcastle33.civevolved.main.CivEvolved;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemIronTongs extends Item {

	public ItemIronTongs(){
		this.setUnlocalizedName("civevolved_ironTongs");
		this.setCreativeTab(CivEvolved.mobDropsTab);
		this.setTextureName("civevolved:ironTongs");
	}
}
