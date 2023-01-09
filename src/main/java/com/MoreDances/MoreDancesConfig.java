package com.MoreDances;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("More Dances")
public interface MoreDancesConfig extends Config
{
	@ConfigItem(
		keyName = "More Dances",
		name = "More Dances",
		description = "scatmans world"
	)
	default String greeting()
	{
		return "Big penis";
	}
}
