package com.gmail.sharpcastle33.civevolved.blocks.tanning;

import java.util.Random;

import com.gmail.sharpcastle33.civevolved.main.CivEvolved;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;	
import net.minecraft.world.World;

public class BlockTanningRack extends BlockContainer{
	
	public boolean isActive;
	
	public BlockTanningRack(){
		super(Material.wood);
		this.setBlockName("civevolved_tanningRackBlock");
		this.setBlockTextureName("civevolved:tanningRackBlock");
		this.setCreativeTab(CivEvolved.tanningTab);
		this.setHardness(2F);
		this.isActive = false;
	}
	
	public void print(String s){
		System.out.println(s);
	}
	
	@Override
	public TileEntity createNewTileEntity(World w, int p_149915_2_) {
		// TODO Auto-generated method stub
		return new TileTanningRack();
	}
	
	 public void onBlockAdded(World world, int x, int y, int z)
	  {
	        world.setTileEntity(x, y, z, createNewTileEntity(world, 0));
	  }
	 
	 @Override
	  public boolean hasTileEntity(int metadata)
	  {
	        return true;
	  }
	
	/*public boolean onBlockActivated(World w, int x, int y, int z){
		//TODO
		return true;
	}*/
	
	private void dropItem(){
		
	}
	
	public TileEntity createNewTileEntity(World w){
		return new TileTanningRack();
	}
	
	public void onBlockClicked(World world, int x, int y, int z, EntityPlayer p){
		System.out.println("tanning rack clicked!");
		
		if(world.isRemote){
			System.out.println("world is remote, returning");
			return;
		}
		
		ItemStack hand = p.getCurrentEquippedItem();
		TileTanningRack t = (TileTanningRack) world.getTileEntity(x, y, z);
		
		if(hand == null){
			print("no item in hand");
			if(t.getStackInSlot(0) != null){
				print("given item");
				if(p.inventory.addItemStackToInventory(t.getStackInSlot(0))){
					t.decrStackSize(0, 1);
				}else{
					Random rand = new Random();
					ItemStack itemstack = t.getStackInSlot(0);
					float f = rand.nextFloat() * 0.8F + 0.1F;
					float f1 = rand.nextFloat() * 0.8F + 0.1F;
					float f2 = rand.nextFloat() * 0.8F + 0.1F;
					EntityItem item = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), 1, itemstack.getItemDamage()));
					world.spawnEntityInWorld(item);
					t.decrStackSize(0, 1);
				}
			}else{
				return;
			}
		}else{ //bug, you can put in more than allowed amount.
			print("item in hand");
			if(t.isItemValid(hand)){
				print("item valid");
				if(t.isFull()){
					return;
				}else{
					print("rack not full");
					t.setInventorySlotContents(0, hand);
					int temp = hand.stackSize-1;
					print(String.valueOf(temp));
					p.setCurrentItemOrArmor(0, new ItemStack(hand.getItem(),temp));
					if(hand.stackSize-1 <= 0){
						p.setCurrentItemOrArmor(0, null);
					}
					//TODO remove item from hand
				}
			}
		}
	}
	
	/*public void breakBlock(World world, int x, int y, int z, Block par4, int par5) {
	    TileTanningRack te = (TileTanningRack) world.getTileEntity(x,y,z);
	   super.breakBlock(world, x, y, z, par4, par5);
	   for(int i = 0; i < te.getSizeInventory(); i++){
		  ItemStack stack = te.getStackInSlot(i);
		 // world.spawnEntityInWorld(new EntityItem(stack), x,y,z);
	
	 }*/
	//drops the items on the ground.
	public void breakBlock(World world, int x, int y, int z, Block oldblock, int oldMetadata) {
		TileTanningRack tileentity = (TileTanningRack) world.getTileEntity(x, y, z);

		if(tileentity != null) {
		for(int i = 0; i < tileentity.getSizeInventory(); i++) {
		ItemStack itemstack = tileentity.getStackInSlot(i);
		Random rand = new Random();

		if(itemstack != null) {
		float f = rand.nextFloat() * 0.8F + 0.1F;
		float f1 = rand.nextFloat() * 0.8F + 0.1F;
		float f2 = rand.nextFloat() * 0.8F + 0.1F;

		while(itemstack.stackSize > 0) {
		int j = rand.nextInt(21) + 10;

		if(j > itemstack.stackSize) {
		j = itemstack.stackSize;
		}

		itemstack.stackSize -= j;

		EntityItem item = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j, itemstack.getItemDamage()));

		if(itemstack.hasTagCompound()) {
		item.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
		}

		world.spawnEntityInWorld(item);
		}
		}
		}

		world.func_147453_f(x, y, z, oldblock);
		}
		

		super.breakBlock(world, x, y, z, oldblock, oldMetadata);
		}
	   
	}


