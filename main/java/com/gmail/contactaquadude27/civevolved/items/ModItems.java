package com.gmail.contactaquadude27.civevolved.items;

import com.gmail.contactaquadude27.civevolved.utils.ItemCE;
import com.gmail.contactaquadude27.civevolved.utils.RegisterHelper;

import net.minecraft.item.Item;

public class ModItems {
	
	//Ingots
	public static Item copperIngot = new ItemCE("copperIngot");
	public static Item silverIngot = new ItemCE("silverIngot");
	public static Item zincIngot = new ItemCE("zincIngot");
	public static Item tinIngot = new ItemCE("tinIngot");
	public static Item leadIngot = new ItemCE("leadIngot");
	
	//
	
	
	public static void registerItems()
    {
     RegisterHelper.registerItem(copperIngot);
     RegisterHelper.registerItem(silverIngot);
     RegisterHelper.registerItem(zincIngot);
     RegisterHelper.registerItem(tinIngot);
     RegisterHelper.registerItem(leadIngot);
    }


}
