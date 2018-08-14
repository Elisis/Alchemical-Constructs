package elisis.alchemicalconstructs.block;

import cpw.mods.fml.common.registry.GameRegistry;
import elisis.alchemicalconstructs.item.ACItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ACBlocks {
	
	public static Block copper_inlay;
	
	public static Block copper_ore;
	
	/*unlocalizedName, material, drop, least_quantity, most_quantity, hardness, resistance, tool, level*/
	public static Block gypsum_block = new CustomDropBlock("gypsum_block", Material.rock, ACItems.gypsum_dust, 
			2, 4, 0, 0.5f, 2.5f, "pickaxe", 1);
	
	public static void init() {
		
		
		copper_ore = new
		
		
		GameRegistry.registerBlock(gypsum_block, gypsum_block.getUnlocalizedName());
		
		copper_inlay = new Block(metal)
		GameRegistry.registerBlock(copper_inlay, copper_inlay.getUnlocalizedName());
		
	}
	

}