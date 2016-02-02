package com.gmail.sharpcastle33.civevolved.blocks.tanning;

import com.gmail.sharpcastle33.civevolved.main.CivEvolved;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
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
	if(t != null){
		if(t.isFull()){
			System.out.println("rack is full");
			if(hand == null){
				p.setCurrentItemOrArmor(0, t.getItem());
				t.setItem(null);
			}
		}else{
			System.out.println("rack isn't full");
			if(hand != null && t.isItemValid(hand)){
				System.out.println("item is valid");
				if(hand.stackSize == 1){
					System.out.println("right stack size");
					t.setItem(hand);
					p.setCurrentItemOrArmor(0,null);
				}
			}else if(hand != null){
				System.out.println(hand.getUnlocalizedName());
			}
		}
	}else System.out.println("t is null");
		
		
	}

}
