package com.gmail.contactaquadude27.civevolved.tools;
import com.gmail.contactaquadude27.civevolved.tools.classes.ItemClub;
import com.gmail.contactaquadude27.civevolved.utils.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class WoodTools extends Item{
	
	//Materials
	static Item.ToolMaterial WOOD = EnumHelper.addToolMaterial("WOOD", 0, 100, 0.5F, -1.0F, 5);
	
	//Tools
    public static Item woodClub = new ItemClub(WOOD).setUnlocalizedName("club");
    
	//Register Items
    public static void init()
    {
        RegisterHelper.registerItem(woodClub);
    }
}

