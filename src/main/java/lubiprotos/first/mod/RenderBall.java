package lubiprotos.first.mod;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;


public class RenderBall extends TileEntitySpecialRenderer {
	
	ResourceLocation modeloc = new ResourceLocation("lfm:models/ball.obj");
    ResourceLocation texture = new ResourceLocation("lfm:textures/models/ball.png");
    IModelCustom model = AdvancedModelLoader.loadModel(modeloc);

	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z,
            float p_147500_8_) {
		TileEntityBall te2 = (TileEntityBall) te;
		GL11.glPushMatrix();
		GL11.glTranslated(x + 0.5, y + 0.5, z + 0.5);
		GL11.glPushMatrix();
		model.renderAll();
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}

}
