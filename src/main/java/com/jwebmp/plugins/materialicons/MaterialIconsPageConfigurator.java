package com.jwebmp.plugins.materialicons;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgStyleSheet;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * Page configurator for Material Design Icons (Community) — registers &#64;mdi/font CSS via npm.
 */
@PluginInformation(pluginName = "MaterialIcons",
		pluginUniqueName = "material-icons",
		pluginDescription = "Material Design Icons (Community) — 2,000+ icons using the mdi- CSS class prefix with web font rendering.",
		pluginVersion = "7.4.47",
		pluginDependancyUniqueIDs = "",
		pluginCategories = "fonts, icons",
		pluginSubtitle = "Material Design Icons community icon collection for web design and apps",
		pluginGitUrl = "https://github.com/JWebMP/JWebMP",
		pluginSourceUrl = "https://materialdesignicons.com/",
		pluginWikiUrl = "https://github.com/JWebMP/JWebMP/wiki",
		pluginOriginalHomepage = "https://materialdesignicons.com/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/material-icons",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2026/05/09",
		pluginGroupId = "com.jwebmp.plugins",
		pluginArtifactId = "material-icons",
		pluginModuleName = "com.jwebmp.plugins.materialicons",
		pluginStatus = PluginStatus.Released
)
@TsDependency(value = "@mdi/font", version = "^7.4.47")
@NgStyleSheet("node_modules/@mdi/font/css/materialdesignicons.min.css")
public class MaterialIconsPageConfigurator
		implements IPageConfigurator<MaterialIconsPageConfigurator>
{
	@Override
	public IPage<?> configure(IPage<?> page)
	{
		return page;
	}

	@Override
	public boolean enabled()
	{
		return true;
	}
}
