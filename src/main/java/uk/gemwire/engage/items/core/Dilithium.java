package uk.gemwire.engage.items.core;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.List;

public class Dilithium extends Item {

    public Dilithium() {
        super(new Properties().maxStackSize(16).group(ItemGroup.MISC));
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> componentList, ITooltipFlag flag) {
        componentList.add(new StringTextComponent("Crucial to controlling matter-antimatter reactions").mergeStyle(TextFormatting.GOLD));
    }

}
