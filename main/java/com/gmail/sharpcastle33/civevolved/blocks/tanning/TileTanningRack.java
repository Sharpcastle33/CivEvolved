package com.gmail.sharpcastle33.civevolved.blocks.tanning;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileTanningRack extends TileEntity implements IInventory{

	ArrayList<String> allowedItems = new ArrayList<String>();
	public ItemStack item;
	private ItemStack[] inventory;
	public TileTanningRack(){
		super();
		allowedItems.add("item.civevolved_hide");
	    this.inventory = new ItemStack[this.getSizeInventory()];
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt) {
	    super.writeToNBT(nbt);

	    NBTTagList list = new NBTTagList();
	    for (int i = 0; i < this.getSizeInventory(); ++i) {
	        if (this.getStackInSlot(i) != null) {
	            NBTTagCompound stackTag = new NBTTagCompound();
	            stackTag.setByte("Slot", (byte) i);
	            this.getStackInSlot(i).writeToNBT(stackTag);
	            list.appendTag(stackTag);
	        }
	    }
	    nbt.setTag("Items", list);

	    if (this.hasCustomName()) {
	        nbt.setString("CustomName", this.getCustomName());
	    }
	}


	@Override
	public void readFromNBT(NBTTagCompound nbt) {
	    super.readFromNBT(nbt);

	    NBTTagList list = nbt.getTagList("Items", 10);
	    for (int i = 0; i < list.tagCount(); ++i) {
	        NBTTagCompound stackTag = list.getCompoundTagAt(i);
	        int slot = stackTag.getByte("Slot") & 255;
	        this.setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(stackTag));
	    }

	   /* if (nbt.hasKey("CustomName", 8)) {
	        this.setCustomName(nbt.getString("CustomName"));
	    }*/
	}
	
	/*public ItemStack getItem(){
		return item;
	}
	
	public void setItem(ItemStack i){
		item = i;
	}*/
	
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
	
	public boolean isFull(){
		if(this.getStackInSlot(0) != null){
			return true;
		}else return false;
	}

	@Override
	public int getSizeInventory() {
		return 1;
	}

	@Override
	public ItemStack getStackInSlot(int index) {
		if (index < 0 || index >= this.getSizeInventory())
	        return null;
	    return this.inventory[index];
	}

	@Override
	public ItemStack decrStackSize(int index, int count) {
	    if (this.getStackInSlot(index) != null) {
	        ItemStack itemstack;

	        if (this.getStackInSlot(index).stackSize <= count) {
	            itemstack = this.getStackInSlot(index);
	            this.setInventorySlotContents(index, null);
	            this.markDirty();
	            return itemstack;
	        } else {
	            itemstack = this.getStackInSlot(index).splitStack(count);

	            if (this.getStackInSlot(index).stackSize <= 0) {
	                this.setInventorySlotContents(index, null);
	            } else {
	                //Just to show that changes happened
	                this.setInventorySlotContents(index, this.getStackInSlot(index));
	            }

	            this.markDirty();
	            return itemstack;
	        }
	    } else {
	        return null;
	    }
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int index) {
		ItemStack stack = this.getStackInSlot(index);
	    this.setInventorySlotContents(index, null);
	    return stack;
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
		 if (index < 0 || index >= this.getSizeInventory())
		        return;

		    if (stack != null && stack.stackSize > this.getInventoryStackLimit())
		        stack.stackSize = this.getInventoryStackLimit();
		        
		    if (stack != null && stack.stackSize == 0)
		        stack = null;

		    this.inventory[index] = stack;
		    this.markDirty();
	}

	@Override
	public String getInventoryName() {
		// TODO Auto-generated method stub
		return "Tanning Rack";
	}

	@Override
	public boolean hasCustomInventoryName() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean hasCustomName(){
		return hasCustomInventoryName();
	}
	
	public String getCustomName(){
		return this.getInventoryName();
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer p) {
		if(worldObj.getTileEntity(xCoord, yCoord, zCoord) == this 
				&& p.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) < 64){
			return true;
		}else return false;
	}

	@Override
	public void openInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeInventory() {
		// TODO Auto-generated method stub
		
	}
	
	public void clear() {
	    for (int i = 0; i < this.getSizeInventory(); i++)
	        this.setInventorySlotContents(i, null);
	}

	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
}
