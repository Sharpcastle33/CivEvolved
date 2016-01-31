package com.gmail.sharpcastle33.civevolved.items.tanning;

import com.gmail.sharpcastle33.civevolved.main.CivEvolved;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBuckskin extends Item {

	public ItemBuckskin(){
		this.setUnlocalizedName("civevolved_buckskin");
		this.setCreativeTab(CivEvolved.tanningTab);
		this.setTextureName("civevolved:buckskin");
	}
}
