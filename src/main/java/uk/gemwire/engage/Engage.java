package uk.gemwire.engage;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uk.gemwire.engage.registry.RegistryObjects;

@Mod(Engage.MODID)
public class Engage {
    public static final String MODID = "engage";
    public static final Logger LOGGER = LogManager.getLogger();

    public Engage() {
        RegistryObjects.init();
        EngageEvents.subscribeEvents();
    }

}
