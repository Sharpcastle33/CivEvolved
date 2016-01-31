package com.gmail.sharpcastle33.civevolved.items.tanning;

import com.gmail.sharpcastle33.civevolved.main.CivEvolved;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTannedLeather extends Item {

	public ItemTannedLeather(){
		this.setUnlocalizedName("civevolved_tannedLeather");
		this.setCreativeTab(CivEvolved.tanningTab);
		this.setTextureName("civevolved:tannedLeather");
	}
}
