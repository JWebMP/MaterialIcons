package com.jwebmp.plugins.materialicons.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class MaterialIconsExclusionsModule
		implements IGuiceScanModuleExclusions<MaterialIconsExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.materialicons");
		return strings;
	}
}
