package elocindev.create_questing.fabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import elocindev.create_questing.fabric.config.ConfigEntries;
import elocindev.create_questing.fabric.registry.ItemRegistry;
import elocindev.create_questing.fabric.theme.ThemeSetup;
import elocindev.necronomicon.api.config.v1.NecConfigAPI;
import elocindev.necronomicon.api.resource.v1.ResourceBuilderAPI;

public class CreateQuesting implements ModInitializer {
    public static final String MODID = "create_questing";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static ConfigEntries Config;

	@Override
	public void onInitialize() {
		// TODO: Uhh probably redo the whole mod or most parts of it, I made this in 20 minutes and it's not very good

		NecConfigAPI.registerConfig(ConfigEntries.class);

        Config = ConfigEntries.INSTANCE;
        ThemeSetup.setup();

		LOGGER.info("Loaded Create Questing Config");
		ResourceBuilderAPI.registerBuiltinPack(FabricLoader.getInstance(), MODID, "quest_shapes", Component.literal("Adds create-like quest shapes"), false, false);

		ItemRegistry.register();
	}
}