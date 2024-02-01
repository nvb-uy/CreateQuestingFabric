package elocindev.create_questing.fabric.registry;

import elocindev.create_questing.fabric.item.QuestBlueprint;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ItemRegistry {

    public static final Item QUEST_BLUEPRINT = new QuestBlueprint();

    public static void register() {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation("create_questing:blueprint"), QUEST_BLUEPRINT);
    }    
}
