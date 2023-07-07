package lubiprotos.first.mod;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Blockball extends BlockContainer {

	protected Blockball(Material Material) {
		super(Material);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityBall();
	}
	
	
	@Override
	public boolean isOpaqueCube() {
	return false;
	  }
	public int getRenderType() {
	return -1;
	  }
	public boolean renderAsNormalBlock() {
	return false;
	  }

}
