package com.gmail.contactaquadude27.civevolved.utils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCE extends Item
{
    public ItemCE(String name)
    {
        super();
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setUnlocalizedName(name);
        this.setTextureName(Reference.MODID + ":" + name);
    }
}