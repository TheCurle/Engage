package uk.gemwire.engage;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import uk.gemwire.engage.datagen.Datagen;

public class EngageEvents {

    public static void subscribeEvents() {
        //FMLJavaModLoadingContext.get().getModEventBus().register(this);
        FMLJavaModLoadingContext.get().getModEventBus().register(Datagen.class);
    }
}
