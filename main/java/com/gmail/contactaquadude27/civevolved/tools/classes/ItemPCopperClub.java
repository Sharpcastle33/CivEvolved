package com.gmail.contactaquadude27.civevolved.tools.classes;

import java.util.HashSet;
import java.util.Set;

import com.gmail.contactaquadude27.civevolved.utils.Reference;
import com.gmail.sharpcastle33.civevolved.items.tools.types.ItemClub;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSword;
=======
import net.minecraft.item.Item.ToolMaterial;

public class ItemPCopperClub extends ItemClub
{
	public final ToolMaterial toolMaterial;
	static Set<Blocks> eff = new HashSet<Blocks>();

	public ItemPCopperClub(ToolMaterial EnumToolMaterial)
	{
		super(EnumToolMaterial);
		toolMaterial = EnumToolMaterial;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}

