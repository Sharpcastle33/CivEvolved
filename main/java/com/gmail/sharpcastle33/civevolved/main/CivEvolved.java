package com.gmail.sharpcastle33.civevolved.main;

import com.gmail.contactaquadude27.civevolved.tools.Materials;
import com.gmail.contactaquadude27.civevolved.utils.Reference;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockCoalOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockCopperOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockDiamondOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockEmeraldOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockGoldOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockGoodCoalOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockGoodCopperOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockGoodDiamondOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockGoodEmeraldOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockGoodGoldOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockGoodIronOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockGoodLapisOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockGoodLeadOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockGoodRedstoneOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockGoodSilverOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockGoodTinOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockGoodZincOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockIronOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockLapisOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockLeadOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockPoorCoalOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockPoorCopperOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockPoorDiamondOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockPoorEmeraldOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockPoorGoldOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockPoorIronOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockPoorLapisOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockPoorLeadOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockPoorRedstoneOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockPoorSilverOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockPoorTinOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockPoorZincOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockRedstoneOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockSilverOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockTinOre;
import com.gmail.sharpcastle33.civevolved.blocks.ore.BlockZincOre;
import com.gmail.sharpcastle33.civevolved.creativetabs.TabMobDrops;
import com.gmail.sharpcastle33.civevolved.creativetabs.TabOres;
import com.gmail.sharpcastle33.civevolved.creativetabs.TabTanning;
import com.gmail.sharpcastle33.civevolved.items.chunks.ItemIronChunk;
import com.gmail.sharpcastle33.civevolved.items.chunks.ItemLargeIronChunk;
import com.gmail.sharpcastle33.civevolved.items.chunks.ItemSmallIronChunk;
import com.gmail.sharpcastle33.civevolved.items.mobdrops.ItemCowHide;
import com.gmail.sharpcastle33.civevolved.items.tanning.ItemArmorPadding;
import com.gmail.sharpcastle33.civevolved.items.tanning.ItemBuckskin;
import com.gmail.sharpcastle33.civevolved.items.tanning.ItemHandle;
import com.gmail.sharpcastle33.civevolved.items.tanning.ItemHide;
import com.gmail.sharpcastle33.civevolved.items.tanning.ItemTannedLeather;
import com.gmail.sharpcastle33.civevolved.items.tanning.ItemTanningOil;
import com.gmail.sharpcastle33.civevolved.items.tools.wood.ItemWoodClub;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class CivEvolved {

	//+======+
	//|MOD ID|
	//+======+
    public static final String MODID = "civevolved";
    public static final String VERSION = "1.0";
    
    //+=============+
    //|CREATIVE TABS|
    //+=============+
    public static CreativeTabs oreTab = new TabOres("oreTab");
    public static CreativeTabs tanningTab = new TabTanning("tanningTab");
    public static CreativeTabs mobDropsTab = new TabMobDrops("mobDropsTab");

	
    //+======+
	//|BLOCKS|
	//+======+
    
    //ore
    
    public static Block coalOre;
    public static Block copperOre;
    public static Block diamondOre;
    public static Block emeraldOre;
    public static Block goldOre;
    public static Block ironOre;
    public static Block lapisOre;
    public static Block leadOre;
    public static Block redstoneOre;
    public static Block silverOre;
    public static Block tinOre;
    public static Block zincOre;
    //poor ore
    public static Block coalPoorOre;
    public static Block copperPoorOre;
    public static Block diamondPoorOre;
    public static Block emeraldPoorOre;
    public static Block goldPoorOre;
    public static Block ironPoorOre;
    public static Block lapisPoorOre;
    public static Block leadPoorOre;
    public static Block redstonePoorOre;
    public static Block silverPoorOre;
    public static Block tinPoorOre;
    public static Block zincPoorOre;
    //good ore
    public static Block coalGoodOre;
    public static Block copperGoodOre;
    public static Block diamondGoodOre;
    public static Block emeraldGoodOre;
    public static Block goldGoodOre;
    public static Block ironGoodOre;
    public static Block lapisGoodOre;
    public static Block leadGoodOre;
    public static Block redstoneGoodOre;
    public static Block silverGoodOre;
    public static Block tinGoodOre;
    public static Block zincGoodOre;
   
    
    
    //+=====+
	//|ITEMS|
	//+=====+
    
    //ore chunks
    public static Item ironChunk;
    public static Item ironSmallChunk;
    public static Item ironLargeChunk;  
    //wooden tools
    public static Item woodClub;
    //mob drops
    public static Item cowHide;
    //tanning tree
    public static Item hide;
    public static Item tanningOil;
    public static Item tannedLeather;
    public static Item buckskin;
    public static Item armorPadding;
    public static Item handle;
    
    
    
    //+==============+
    //|TOOL MATERIALS|
    //+==============+
    
    //wooden
    public static ToolMaterial WOODEN_CLUB = EnumHelper.addToolMaterial("WOODEN_CLUB", 0, 30, 1.0F, 0.0F, 0);
    @EventHandler //loading event
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Loading Civilization: Evolved...");
        System.out.println("Registering Blocks...");
        registerBlocks();
        System.out.println("Registering Items...");
        registerItems();
        registerRecipes();
    }
    //register blocks to GameRegistry
    public void registerBlocks(){
    	registerOres();
    }
    //register items to GameRegistry
    public void registerItems(){
    	registerChunks();
    	registerTools();
    	registerMobDrops();
    	registerTanningItems();
    	Materials.registerItems();
    }
    
    public void registerRecipes(){
    	registerTanningRecipes();
    }
    
    public void registerTanningRecipes(){
    	GameRegistry.addShapelessRecipe(new ItemStack(this.hide,4), new Object[]
    	{
    		this.cowHide, Materials.flintKnife	
    	});
    }
    
    public void registerTanningItems(){
    	hide = new ItemHide();
    	GameRegistry.registerItem(hide, "hide");
    	
    	tannedLeather = new ItemTannedLeather();
    	GameRegistry.registerItem(tannedLeather, "tannedLeather");
    	
    	tanningOil = new ItemTanningOil();
    	GameRegistry.registerItem(tanningOil, "tanningOil");
    	
    	buckskin = new ItemBuckskin();
    	GameRegistry.registerItem(buckskin, "buckskin");
    	
    	armorPadding = new ItemArmorPadding();
    	GameRegistry.registerItem(armorPadding, "armorPadding");
    	
    	handle = new ItemHandle();
    	GameRegistry.registerItem(handle, "handle");
    }
    
    public void registerMobDrops(){
    	cowHide = new ItemCowHide();
    	GameRegistry.registerItem(cowHide, "cowHide");
    }
    
    public void registerTools(){
    	woodClub = new ItemWoodClub();
    	GameRegistry.registerItem(woodClub,"woodClub");
    }
    
    public void registerChunks(){
    	System.out.println("Registering chunk items...");
    	
    	ironChunk = new ItemIronChunk();
    	GameRegistry.registerItem(ironChunk, "ironChunk");
    	
    	ironLargeChunk = new ItemLargeIronChunk();
    	GameRegistry.registerItem(ironLargeChunk, "ironLargeChunk");
    	
    	ironSmallChunk = new ItemSmallIronChunk();
    	GameRegistry.registerItem(ironSmallChunk, "ironSmallChunk");
    }
    
    public void registerOres(){
    	System.out.println("Registering ores...");
    	
    	coalOre = new BlockCoalOre();
    	GameRegistry.registerBlock(coalOre, "coalOre");
    	
    	copperOre = new BlockCopperOre();
    	GameRegistry.registerBlock(copperOre, "copperOre");
    	
    	diamondOre = new BlockDiamondOre();
    	GameRegistry.registerBlock(diamondOre, "diamondOre");
    	
    	emeraldOre = new BlockEmeraldOre();
    	GameRegistry.registerBlock(emeraldOre, "emeraldOre");
    	
    	ironOre = new BlockIronOre();
    	GameRegistry.registerBlock(ironOre, "ironOre");
    	
    	goldOre = new BlockGoldOre();
    	GameRegistry.registerBlock(goldOre, "goldOre");
    	
    	lapisOre = new BlockLapisOre();
    	GameRegistry.registerBlock(lapisOre, "lapisOre");
    	
    	leadOre = new BlockLeadOre();
    	GameRegistry.registerBlock(leadOre, "leadOre");
    	
    	redstoneOre = new BlockRedstoneOre();
    	GameRegistry.registerBlock(redstoneOre, "redstoneOre");
    	
    	silverOre = new BlockSilverOre();
    	GameRegistry.registerBlock(silverOre, "silverOre");
    	
    	tinOre = new BlockTinOre();
    	GameRegistry.registerBlock(tinOre, "tinOre");
    	
    	zincOre = new BlockZincOre();
    	GameRegistry.registerBlock(zincOre, "zincOre");
    	
    	//poor ores
    	
    	coalPoorOre = new BlockPoorCoalOre();
    	GameRegistry.registerBlock(coalPoorOre, "coalPoorOre");
    	
    	copperPoorOre = new BlockPoorCopperOre();
    	GameRegistry.registerBlock(copperPoorOre, "copperPoorOre");
    	
    	diamondPoorOre = new BlockPoorDiamondOre();
    	GameRegistry.registerBlock(diamondPoorOre, "diamondPoorOre");
    	
    	emeraldPoorOre = new BlockPoorEmeraldOre();
    	GameRegistry.registerBlock(emeraldPoorOre, "emeraldPoorOre");
    	
    	ironPoorOre = new BlockPoorIronOre();
    	GameRegistry.registerBlock(ironPoorOre, "ironPoorOre");
    	
    	goldPoorOre = new BlockPoorGoldOre();
    	GameRegistry.registerBlock(goldPoorOre, "goldPoorOre");
    	
    	lapisPoorOre = new BlockPoorLapisOre();
    	GameRegistry.registerBlock(lapisPoorOre, "lapisPoorOre");
    	
    	leadPoorOre = new BlockPoorLeadOre();
    	GameRegistry.registerBlock(leadPoorOre, "leadPoorOre");
    	
    	redstonePoorOre = new BlockPoorRedstoneOre();
    	GameRegistry.registerBlock(redstonePoorOre, "redstonePoorOre");
    	
    	silverPoorOre = new BlockPoorSilverOre();
    	GameRegistry.registerBlock(silverPoorOre, "silverPoorOre");
    	
    	tinPoorOre = new BlockPoorTinOre();
    	GameRegistry.registerBlock(tinPoorOre, "tinPoorOre");
    	
    	zincPoorOre = new BlockPoorZincOre();
    	GameRegistry.registerBlock(zincPoorOre, "zincPoorOre");
    	
    	//good ores
    	
    	coalGoodOre = new BlockGoodCoalOre();
    	GameRegistry.registerBlock(coalGoodOre, "coalGoodOre");
    	
    	copperGoodOre = new BlockGoodCopperOre();
    	GameRegistry.registerBlock(copperGoodOre, "copperGoodOre");
    	
    	diamondGoodOre = new BlockGoodDiamondOre();
    	GameRegistry.registerBlock(diamondGoodOre, "diamondGoodOre");
    	
    	emeraldGoodOre = new BlockGoodEmeraldOre();
    	GameRegistry.registerBlock(emeraldGoodOre, "emeraldGoodOre");
    	
    	ironGoodOre = new BlockGoodIronOre();
    	GameRegistry.registerBlock(ironGoodOre, "ironGoodOre");
    	
    	goldGoodOre = new BlockGoodGoldOre();
    	GameRegistry.registerBlock(goldGoodOre, "goldGoodOre");
    	
    	lapisGoodOre = new BlockGoodLapisOre();
    	GameRegistry.registerBlock(lapisGoodOre, "lapisGoodOre");
    	
    	leadGoodOre = new BlockGoodLeadOre();
    	GameRegistry.registerBlock(leadGoodOre, "leadGoodOre");
    	
    	redstoneGoodOre = new BlockGoodRedstoneOre();
    	GameRegistry.registerBlock(redstoneGoodOre, "redstoneGoodOre");
    	
    	silverGoodOre = new BlockGoodSilverOre();
    	GameRegistry.registerBlock(silverGoodOre, "silverGoodOre");
    	
    	tinGoodOre = new BlockGoodTinOre();
    	GameRegistry.registerBlock(tinGoodOre, "tinGoodOre");
    	
    	zincGoodOre = new BlockGoodZincOre();
    	GameRegistry.registerBlock(zincGoodOre, "zincGoodOre");
    }
}
