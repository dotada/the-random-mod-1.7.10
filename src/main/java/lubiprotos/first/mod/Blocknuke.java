package lubiprotos.first.mod;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Blocknuke extends BlockContainer {

	protected Blocknuke(Material Material) {
		super(Material);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityNuke();
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


@Override
public boolean onBlockActivated(World world, int x, int y, int z,
        EntityPlayer player, int uhh, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
    world.createExplosion(player, x, y, z, 1000F, true);
    return super.onBlockActivated(world, x, y, z, player, uhh, p_149727_7_,
            p_149727_8_, p_149727_9_);
}}



