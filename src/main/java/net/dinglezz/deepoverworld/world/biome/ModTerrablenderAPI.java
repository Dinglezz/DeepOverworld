package net.dinglezz.deepoverworld.world.biome;

import net.dinglezz.deepoverworld.DeepOverworld;
import net.dinglezz.deepoverworld.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.RegionType;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(Identifier.of(DeepOverworld.MOD_ID, "overworld"), RegionType.OVERWORLD, 3));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, DeepOverworld.MOD_ID, ModMaterialRules.makeRules());
    }
}
