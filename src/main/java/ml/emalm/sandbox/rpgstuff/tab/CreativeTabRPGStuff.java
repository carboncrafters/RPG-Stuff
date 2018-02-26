package ml.emalm.sandbox.rpgstuff.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabRPGStuff extends CreativeTabs {

    public CreativeTabRPGStuff(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.IRON_SWORD;
    }
}
