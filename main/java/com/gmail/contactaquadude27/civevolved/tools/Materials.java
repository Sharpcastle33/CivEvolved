package com.gmail.contactaquadude27.civevolved.tools;

import com.gmail.contactaquadude27.civevolved.tools.classes.ItemFlintKnife;
import com.gmail.contactaquadude27.civevolved.utils.RegisterHelper;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class Materials {   
	
	//=======================//
	//   FLINT TOOLS        //
	//======================//
	
	static Item.ToolMaterial FLINT = EnumHelper.addToolMaterial("FLINT", 0, 60, 1F, 1.0F, 14);
	
	//Items
	public static Item flintKnife = new ItemFlintKnife(FLINT).setUnlocalizedName("flintKnife");

    public static void registerItems() {
    	RegisterHelper.registerItem(flintKnife);
    }
}
