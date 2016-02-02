package com.gmail.contactaquadude27.civevolved.tools;

import com.gmail.contactaquadude27.civevolved.tools.classes.ItemCopperPick;
import com.gmail.contactaquadude27.civevolved.tools.classes.ItemCopperSword;
import com.gmail.contactaquadude27.civevolved.tools.classes.ItemFlintKnife;
import com.gmail.contactaquadude27.civevolved.tools.classes.ItemPCopperPick;
import com.gmail.contactaquadude27.civevolved.tools.classes.ItemPCopperSword;
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
	static Item.ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 1, 150, 2.9F, 1.5F, 30);
     
	//Items
	public static Item pcopperSword = new ItemPCopperSword(POORCOPPER).setUnlocalizedName("pcopperSword");
	public static Item pcopperPick = new ItemPCopperPick(POORCOPPER).setUnlocalizedName("pcopperPick");
			
    public static Item copperSword = new ItemCopperSword(COPPER).setUnlocalizedName("copperSword");
    public static Item copperPick = new ItemCopperPick(COPPER).setUnlocalizedName("copperPick");
	//==============//		
	//RegisterHelper// 	
	//=============//
	public static void registerItems() {
    	RegisterHelper.registerItem(flintKnife);
    	RegisterHelper.registerItem(pcopperSword);
    	RegisterHelper.registerItem(pcopperPick);
    	RegisterHelper.registerItem(copperSword);
    }
}
