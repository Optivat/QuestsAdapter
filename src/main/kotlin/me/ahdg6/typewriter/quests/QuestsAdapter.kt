package me.ahdg6.typewriter.quests

import lirand.api.extensions.server.server
import me.gabber235.typewriter.adapters.Adapter
import me.gabber235.typewriter.adapters.TypewriteAdapter
import me.gabber235.typewriter.logger

@Adapter("Quests", "For Using Quests", "0.3.2")

object QuestsAdapter : TypewriteAdapter() {

    override fun initialize() {
        if (!server.pluginManager.isPluginEnabled("Quests")) {
            logger.warning("Quests plugin not found, try installing it or disabling the Quests adapter")
            return
        } else {
            logger.info("Quests plugin adapter has loaded successfully!")
        }
    }

}