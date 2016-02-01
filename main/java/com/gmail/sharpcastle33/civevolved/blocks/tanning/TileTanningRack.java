package com.gmail.sharpcastle33.civevolved.blocks.tanning;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileTanningRack extends TileEntity{

	ArrayList<String> allowedItems = new ArrayList<String>();
	public ItemStack item;
	public TileTanningRack(){
		super();
		allowedItems.add("cowHide");
	}
	
	public void writeToNBT(NBTTagCompound tag){
		super.writeToNBT(tag);
		if(item != null){
			item.writeToNBT(tag);
		}
	}
	
	public void readFromNBT(NBTTagCompound tag){
		super.readFromNBT(tag);
		item = ItemStack.loadItemStackFromNBT(tag);
	}
	
	public ItemStack getItem(){
		return item;
	}
	
	public void setItem(ItemStack i){
		item = i;
	}
	
	public int getInventoryStackLimit(){
		return 1;
	}
	
	public boolean isUsableByPlayer(EntityPlayer p){
		if(worldObj.getTileEntity(xCoord, yCoord, zCoord) == this 
				&& p.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) < 64){
			return true;
		}else return false;
	}
	
	public boolean isItemValid(ItemStack i){
		if(allowedItems.contains(i.getItem().getUnlocalizedName())){
			return true;
		}else return false;
	}
	
	
}
