package com.gmail.sharpcastle33.civevolved.creativetabs;

import com.gmail.sharpcastle33.civevolved.main.CivEvolved;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabForging extends CreativeTabs{

	public TabForging(int i, String s) {
		super(i, s);
		// TODO Auto-generated constructor stub
	}
	
	public TabForging(String s){
		super(s);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return CivEvolved.ironChunk;
	}

}
