package lubiprotos.first.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Cheeses extends CreativeTabs {

	public Cheeses(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return new ItemStack(TutorialMod.itemCHEESE).getItem();
	}

}




