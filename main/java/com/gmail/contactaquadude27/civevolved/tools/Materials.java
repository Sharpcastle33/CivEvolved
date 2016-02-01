package com.gmail.contactaquadude27.civevolved.tools;

import com.gmail.contactaquadude27.civevolved.tools.classes.ItemFlintKnife;
import com.gmail.contactaquadude27.civevolved.tools.classes.ItemPCopperPick;
import com.gmail.contactaquadude27.civevolved.tools.classes.ItemPCopperClub;
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

	//================//
	// COPPER TOOLS  //  
	//===============//  
	//As a heads up, swords always add 4 damage to their base, I've subtracted it for you.
	static Item.ToolMaterial POORCOPPER = EnumHelper.addToolMaterial("PCOPPER", 1, 100, 2.5F, 0.0F, 25);
     
	//Items
	public static Item pcopperSword = new ItemPCopperClub(POORCOPPER).setUnlocalizedName("pcopperSword");
	
	//Items
	public static Item pcopperPick = new ItemPCopperPick(POORCOPPER).setUnlocalizedName("pcopperPick");
			
	//==============//		
	//RegisterHelper// 	
	//=============//
	public static void registerItems() {
    	RegisterHelper.registerItem(flintKnife);
    	RegisterHelper.registerItem(pcopperSword);
    	RegisterHelper.registerItem(pcopperPick);
    }
}
