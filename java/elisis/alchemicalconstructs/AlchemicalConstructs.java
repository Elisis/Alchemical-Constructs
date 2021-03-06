package elisis.alchemicalconstructs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import elisis.alchemicalconstructs.block.ACBlocks;
import elisis.alchemicalconstructs.item.ACItems;
import elisis.alchemicalconstructs.recipe.ACRecipes;
import elisis.alchemicalconstructs.world.ACWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = AlchemicalConstructs.MODID, name = AlchemicalConstructs.NAME, version = AlchemicalConstructs.VERSION)
public class AlchemicalConstructs {
	
	public static final String MODID = "alchemicalconstructs";
	public static final String NAME = "Alchemical Constructs";
	public static final String VERSION = "1.7.10a0.1";
	
	public static final Logger logger = LogManager.getLogger(MODID);
	
	
	//Mod's Tab. Unused
	public static final CreativeTabs tabAlchemical = new CreativeTabs("Alchemical Constructs") {
		
		@Override 
		public Item getTabIconItem() {return ACItems.chalk;}
	};
	
	//Not needed *right* now, but will be useful to have in the future. 
	@Instance
	public static AlchemicalConstructs instance = new AlchemicalConstructs(); 
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) { 
		
		ACItems.init();
		ACBlocks.init();
		
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		ACRecipes.init();
		GameRegistry.registerWorldGenerator(new ACWorldGen(), 0);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
