package com.gmail.contactaquadude27.civevolved.tools.classes;

import java.util.HashSet;
import java.util.Set;

import com.gmail.contactaquadude27.civevolved.utils.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemPCopperSword extends ItemSword
{
	public final ToolMaterial toolMaterial;
	static Set<Blocks> eff = new HashSet<Blocks>();

	public ItemPCopperSword(ToolMaterial EnumToolMaterial)
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
	/*
	 * You don't need this, this gives the item functionality in the crafting grid like IC2's Forge Hammer.
	 */
	/*public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack){
		return false;
	}
	
	public boolean hasContainerItem(ItemStack stack){
		return true;
	}
	
	public ItemStack getContainerItem(ItemStack stack){
		stack.setItemDamage(stack.getItemDamage() - 1);
		return stack;
	}*/
}

