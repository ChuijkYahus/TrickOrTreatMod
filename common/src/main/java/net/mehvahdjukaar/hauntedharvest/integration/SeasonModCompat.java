package net.mehvahdjukaar.hauntedharvest.integration;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.mehvahdjukaar.moonlight.api.platform.configs.ConfigBuilder;
import net.minecraft.world.level.Level;

public class SeasonModCompat {

    @ExpectPlatform
    public static boolean isAutumn(Level level) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static boolean shouldMobWearPumpkin(Level level) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void addConfig(ConfigBuilder builder) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void refresh() {
        throw new AssertionError();
    }
}
