package elocindev.create_questing.fabric.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import elocindev.necronomicon.api.config.v1.NecConfigAPI;
import elocindev.necronomicon.config.NecConfig;

public class ConfigEntries {
    @NecConfig
    public static ConfigEntries INSTANCE;

    public static String getFile() {
        return NecConfigAPI.getFile("create_questing.json");
    }

    public boolean enable_theme_only_in_create_chapters = true;
    public ArrayList<String> create_chapter_names = new ArrayList<String>(
        List.of("Create", "Blueprint")
    );
    public float blueprint_background_scale = 0.5F;
    public float blueprint_background_opacity = 0.9F;
    public int blueprint_background_overlay_red = 255;
    public int blueprint_background_overlay_green = 255;
    public int blueprint_background_overlay_blue = 255;
    public int debug_colorModifier = 0xFFFFFF;
}