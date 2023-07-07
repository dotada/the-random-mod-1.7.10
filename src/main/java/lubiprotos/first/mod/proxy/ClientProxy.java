package lubiprotos.first.mod.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import lubiprotos.first.mod.RenderBall;
import lubiprotos.first.mod.RenderNuke;
import lubiprotos.first.mod.TileEntityBall;
import lubiprotos.first.mod.TileEntityNuke;

public class ClientProxy extends CommonProxy {
	
	
public void renderCallers() {
	
	
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBall.class, new RenderBall());
	   GameRegistry.registerTileEntity(TileEntityBall.class, "TileBall");
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityNuke.class, new RenderNuke());   
	   GameRegistry.registerTileEntity(TileEntityNuke.class, "TileNuke");
    }

}
