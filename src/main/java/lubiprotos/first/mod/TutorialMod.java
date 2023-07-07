package lubiprotos.first.mod;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

@Mod(modid = "lfm", name = "lubiprotos first mod", version = "1.2")
public class TutorialMod {
public static Item itemCHEESE;	
public static Item itemRC;
public static Item itemUranium;
public static Item itemTube;
public static Item itemSC;
public static Item itemPlastic;
public static Block blockcheese;
public static Block blockdrugcheeze;
public static Block blockball;
public static Block blocktroll;
public static Block blocknuke;
public static Item itemuncanny1;
public static Item itemuncanny2;
public static Item itemuncanny3;
public static Item itemuncanny4;
public static Item itemuncanny5;
public static Item itemuncanny6;
public static Item itemuncanny7;
public static Item itemuncanny8;
public static Item itemuncanny9;
public static Item itemuncanny10;


@EventHandler
public void preInit(FMLPreInitializationEvent event) {
	//Item/Block init and registering
	//Config handling
	itemCHEESE = new ItemFood(20, 1.0F, true).setUnlocalizedName("ItemCHEESE").setTextureName("lfm:c").setCreativeTab(Cheeses);
    GameRegistry.registerItem(itemCHEESE, itemCHEESE.getUnlocalizedName().substring(5));
    itemuncanny1 = new ItemUncanny1().setUnlocalizedName("ItemUncanny1").setTextureName("lfm:smiling").setCreativeTab(Cheeses);
    GameRegistry.registerItem(itemuncanny1, itemuncanny1.getUnlocalizedName().substring(5));
    itemuncanny2 = new ItemUncanny2().setUnlocalizedName("ItemUncanny2").setTextureName("lfm:neutral_16x16").setCreativeTab(Cheeses);
    GameRegistry.registerItem(itemuncanny2, itemuncanny2.getUnlocalizedName().substring(5));
    itemuncanny3 = new ItemUncanny3().setUnlocalizedName("ItemUncanny3").setTextureName("lfm:cursed_16x16").setCreativeTab(Cheeses);
    GameRegistry.registerItem(itemuncanny3, itemuncanny3.getUnlocalizedName().substring(5));
    itemuncanny4 = new ItemUncanny4().setUnlocalizedName("ItemUncanny4").setTextureName("lfm:cursed_2_16x16").setCreativeTab(Cheeses);
    GameRegistry.registerItem(itemuncanny4, itemuncanny4.getUnlocalizedName().substring(5));
    itemuncanny5 = new ItemUncanny5().setUnlocalizedName("ItemUncanny5").setTextureName("lfm:cursed_3_16x16").setCreativeTab(Cheeses);
    GameRegistry.registerItem(itemuncanny5, itemuncanny5.getUnlocalizedName().substring(5));
    itemuncanny6 = new ItemUncanny6().setUnlocalizedName("ItemUncanny6").setTextureName("lfm:cursed_4_16x16").setCreativeTab(Cheeses);
    GameRegistry.registerItem(itemuncanny6, itemuncanny6.getUnlocalizedName().substring(5));
    itemuncanny7 = new ItemUncanny7().setUnlocalizedName("ItemUncanny7").setTextureName("lfm:cursed_5_16x16").setCreativeTab(Cheeses);
    GameRegistry.registerItem(itemuncanny7, itemuncanny7.getUnlocalizedName().substring(5));
    itemuncanny8 = new ItemUncanny8().setUnlocalizedName("ItemUncanny8").setTextureName("lfm:cursed_6_16x16").setCreativeTab(Cheeses);
    GameRegistry.registerItem(itemuncanny8, itemuncanny8.getUnlocalizedName().substring(5));
    itemuncanny9 = new ItemUncanny9().setUnlocalizedName("ItemUncanny9").setTextureName("lfm:cursed_7_16x16").setCreativeTab(Cheeses);
    GameRegistry.registerItem(itemuncanny9, itemuncanny9.getUnlocalizedName().substring(5));
    itemuncanny10 = new ItemUncanny10().setUnlocalizedName("ItemUncanny10").setTextureName("lfm:cursed_last_16x16").setCreativeTab(Cheeses);
    GameRegistry.registerItem(itemuncanny10, itemuncanny10.getUnlocalizedName().substring(5));
    itemUranium = new ItemUranium().setUnlocalizedName("ItemUranium").setTextureName("lfm:rod").setCreativeTab(Cheeses);
    GameRegistry.registerItem(itemUranium, itemUranium.getUnlocalizedName().substring(5));
    itemRC = new ItemFood (20, 1.0F, true).setUnlocalizedName("ItemRC").setTextureName("lfm:RC").setCreativeTab(Cheeses);
    GameRegistry.registerItem(itemRC, itemRC.getUnlocalizedName().substring(5));
    itemTube = new ItemTube().setUnlocalizedName("ItemTube").setTextureName("lfm:tube").setCreativeTab(Cheeses);
    GameRegistry.registerItem(itemTube, itemTube.getUnlocalizedName().substring(5));
    itemSC = new ItemFood(20, 1.0F, true).setUnlocalizedName("ItemSC").setTextureName("lfm:SC").setCreativeTab(Cheeses);
    GameRegistry.registerItem(itemSC, itemSC.getUnlocalizedName().substring(5));
    itemPlastic = new ItemPlastic().setUnlocalizedName("ItemPlastic").setTextureName("lfm:Plastic").setCreativeTab(Cheeses);
    GameRegistry.registerItem(itemPlastic, itemPlastic.getUnlocalizedName().substring(5));
    blockcheese = new Blockcheese(Material.rock).setBlockName("Blockcheese").setBlockTextureName("lfm:cheeze").setCreativeTab(Cheeses);
    GameRegistry.registerBlock(blockcheese, blockcheese.getUnlocalizedName().substring(5));
    System.out.println(blockcheese.getUnlocalizedName().substring(5));
    blockdrugcheeze = new Blockdrugcheeze(Material.rock).setBlockName("Blockdrugcheeze").setBlockTextureName("lfm:drugcheeze").setCreativeTab(Cheeses);
    GameRegistry.registerBlock(blockdrugcheeze, blockdrugcheeze.getUnlocalizedName().substring(5));
    System.out.println(blockdrugcheeze.getUnlocalizedName().substring(5));
    blockball = new Blockball(Material.rock).setBlockName("Blockball").setCreativeTab(Cheeses);
    GameRegistry.registerBlock(blockball, blockball.getUnlocalizedName().substring(5));
    System.out.println(blockball.getUnlocalizedName().substring(5));
    blocktroll = new Blocktroll(Material.rock).setBlockName("Blocktroll").setBlockTextureName("lfm:troll").setCreativeTab(Cheeses);
    GameRegistry.registerBlock(blocktroll, blocktroll.getUnlocalizedName().substring(5));
    System.out.println(blocktroll.getUnlocalizedName().substring(5));
    blocknuke = new Blocknuke(Material.rock).setBlockName("Blocknuke").setCreativeTab(Cheeses);
    GameRegistry.registerBlock(blocknuke, blocknuke.getUnlocalizedName().substring(5));
    System.out.println(blocknuke.getUnlocalizedName().substring(5));

}
    	
    @EventHandler 
    public void init(FMLInitializationEvent event) {
    	//Proxy, TileEntity, entity, GUI and packet registering
    	GameRegistry.addRecipe(new ItemStack(itemCHEESE), " s ",
                " m ",
                "   ", 's', Items.stick, 'm', Items.milk_bucket);
    	
    	GameRegistry.addRecipe(new ItemStack(itemUranium), " s ",
                " w ",
                "   ", 's', Items.sugar, 'w', Items.wheat);
    	
    	
    	
        GameRegistry.addRecipe(new ItemStack(itemRC), " w ",
                " c ",
                "   ", 'w', itemUranium, 'c', itemCHEESE);
        
        
        GameRegistry.addRecipe(new ItemStack(itemSC), " c ",
                " t ",
                "   ", 'c', itemCHEESE, 't', itemTube);
        
        GameRegistry.addRecipe(new ItemStack(itemTube), "   ",
                " p ",
                "   ", 'p', itemPlastic);
        
        GameRegistry.addRecipe(new ItemStack(itemPlastic), " p ",
                " c ",
                "   ", 'p', Items.blaze_powder, 'c', Items.coal);
        
        GameRegistry.addRecipe(new ItemStack(blockcheese), "ccc",
                "ccc",
                "ccc", 'c', itemCHEESE);
        
        GameRegistry.addRecipe(new ItemStack(blockdrugcheeze), "ccc",
                "ccc",
                "ccc", 'c', itemRC);
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBall.class, new RenderBall());
        GameRegistry.registerTileEntity(TileEntityBall.class, "TileBall");
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityNuke.class, new RenderNuke());
        GameRegistry.registerTileEntity(TileEntityNuke.class, "TileNuke");
       
    	
    }
    	
    	@EventHandler
    	public void PostInit(FMLPostInitializationEvent event) {}
    	public static CreativeTabs Cheeses = new Cheeses("Cheeses");
    	
    	@EventHandler
    	public void serverLoad(FMLServerStartingEvent event) {
    	}
    	
    	public Item getTabIconItem() {
    		return new ItemStack(TutorialMod.itemCHEESE).getItem();
    	}

    	{


        }}






 