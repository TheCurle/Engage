package uk.gemwire.engage.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;
import uk.gemwire.engage.Engage;
import uk.gemwire.engage.registry.RegistryObjects;

import javax.annotation.Resource;

public class ItemsGen extends ItemModelProvider {


    private ItemModelBuilder transformParent;

    public ItemsGen(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Engage.MODID, helper);
    }

    @Override
    protected void registerModels() {
        Engage.LOGGER.info("Generating items!");

        transformParent = withExistingParent("materials_transform", new ResourceLocation("item/generated"));
        transformParent.transforms()
                .transform(ModelBuilder.Perspective.FIRSTPERSON_RIGHT)
                    .translation(0F, 1.25F, -2.5F)
                    .scale(1, 1, 1)
                    .end()
                .end();

        transformedItem(RegistryObjects.DILITHIUM_ITEM.get());
    }

    void transformedItem(Item i) {
        itemHelper(i, transformParent);
    }

    void itemHelper(Item i, ModelFile parent) {
        final ResourceLocation location = new ResourceLocation(i.getRegistryName().getNamespace(), ModelProvider.ITEM_FOLDER + "/" + i.getRegistryName().getPath());
        ItemModelBuilder builder = factory.apply(location).parent(parent);
        generatedModels.put(location, builder.texture("layer0", location));
    }

}
