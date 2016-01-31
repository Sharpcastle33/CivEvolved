package com.gmail.sharpcastle33.civevolved.creativetabs;

import com.gmail.sharpcastle33.civevolved.main.CivEvolved;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabTanning extends CreativeTabs{

	public TabTanning(int i, String s) {
		super(i, s);
		// TODO Auto-generated constructor stub
	}
	
	public TabTanning(String s){
		super(s);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Item.getItemFromBlock(CivEvolved.ironOre);
	}

}
