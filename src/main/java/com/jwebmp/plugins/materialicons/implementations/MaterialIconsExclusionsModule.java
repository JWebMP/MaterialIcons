package com.jwebmp.plugins.materialicons.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;
import com.guicedee.client.services.config.IGuiceScanJarExclusions;
import java.util.LinkedHashSet;
import java.util.Set;

/** SPI services and direct resource access do not require scanning this library. */
public class MaterialIconsExclusionsModule implements IGuiceScanModuleExclusions<MaterialIconsExclusionsModule>, IGuiceScanJarExclusions<MaterialIconsExclusionsModule> {
    @Override public Set<String> excludeModules() { return Set.of("com.jwebmp.plugins.materialicons"); }
    @Override public Set<String> excludeJars() {
        Set<String> jars = new LinkedHashSet<>();
        jars.add("material-icons.jar");
        for (int digit = 0; digit <= 9; digit++) jars.add("material-icons-" + digit + "*.jar");
        return jars;
    }
}
