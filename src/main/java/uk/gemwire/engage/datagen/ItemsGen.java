package uk.gemwire.engage.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import uk.gemwire.engage.Engage;
import uk.gemwire.engage.registry.RegistryObjects;

import javax.annotation.Resource;

public class ItemsGen extends ItemModelProvider {

    public ItemsGen(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Engage.MODID, helper);
    }

    @Override
    protected void registerModels() {
        Engage.LOGGER.info("Generating items!");
        singleTexture(RegistryObjects.DILITHIUM_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(Engage.MODID, "item/dilithium_item"));
    }
}
