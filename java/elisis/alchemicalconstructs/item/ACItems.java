package elisis.alchemicalconstructs.item;

import cpw.mods.fml.common.registry.GameRegistry;
import elisis.alchemicalconstructs.AlchemicalConstructs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ACItems {
	
	public static Item chalk;
	public static Item golden_chalk;
	public static Item gypsum_dust;
	public static Item wood_ash;
	
	public static Item copper_ingot;
	public static Item lead_ingot;
	
	public static Item weak_reagent;
	public static Item strenthened_reagent;
	
	

	
	/**
     * For registering items, adding stuff to the OreDictionary, the works.
     *
     */
	public static void init() {
		
		wood_ash = new Item().setUnlocalizedName("wood_ash").setTextureName(AlchemicalConstructs.MODID + ":wood_ash").setCreativeTab(CreativeTabs.tabMaterials);
		GameRegistry.registerItem(wood_ash, wood_ash.getUnlocalizedName());
		OreDictionary.registerOre("ashWood", wood_ash);
		
		chalk = new ItemChalk("gypsum");
		GameRegistry.registerItem(chalk, chalk.getUnlocalizedName());
		OreDictionary.registerOre("chalkGypsum", chalk);
		
		golden_chalk = new ItemChalk("gold");
		GameRegistry.registerItem(golden_chalk, golden_chalk.getUnlocalizedName());
		OreDictionary.registerOre("chalkGold", golden_chalk);
		
		gypsum_dust = new Item().setUnlocalizedName("gypsum_dust").setTextureName(AlchemicalConstructs.MODID + ":gypsum_dust").setCreativeTab(CreativeTabs.tabMaterials);
		GameRegistry.registerItem(gypsum_dust, gypsum_dust.getUnlocalizedName());
		OreDictionary.registerOre("dustGypsum", gypsum_dust);
	
		
		copper_ingot = new Item().setUnlocalizedName("copper_ingot").setTextureName(AlchemicalConstructs.MODID + ":copper_ingot").setCreativeTab(CreativeTabs.tabMaterials);
		GameRegistry.registerItem(copper_ingot, copper_ingot.getUnlocalizedName());
		OreDictionary.registerOre("oreCopper", copper_ingot);
		
		lead_ingot = new Item().setUnlocalizedName("lead_ingot").setTextureName(AlchemicalConstructs.MODID + ":lead_ingot").setCreativeTab(CreativeTabs.tabMaterials);
		GameRegistry.registerItem(lead_ingot, lead_ingot.getUnlocalizedName());
		OreDictionary.registerOre("ingotLead", lead_ingot);
	
	}

}
