package uk.gemwire.engage.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import uk.gemwire.engage.Engage;

public class Datagen {

    @SubscribeEvent
    static void generate(GatherDataEvent e) {
        Engage.LOGGER.info("Datagenerating!");
        DataGenerator generator = e.getGenerator();

        if(e.includeClient()) {
            generator.addProvider(new ItemsGen(generator, e.getExistingFileHelper()));
        }
    }


}
