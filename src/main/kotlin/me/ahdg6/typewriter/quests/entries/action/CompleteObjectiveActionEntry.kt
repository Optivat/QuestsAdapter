package me.ahdg6.typewriter.quests.entries.action

import com.titanborn.plugin.Quests
import me.gabber235.typewriter.adapters.Colors
import me.gabber235.typewriter.adapters.Entry
import me.gabber235.typewriter.entry.Criteria
import me.gabber235.typewriter.entry.Modifier
import me.gabber235.typewriter.entry.entries.ActionEntry
import me.gabber235.typewriter.utils.Icons
import org.bukkit.entity.Player


@Entry("objective_completion", "Completes a quest for the player", Colors.GREEN, Icons.CHECK)
class CompleteObjectiveActionEntry (
    override val id: String = "",
    override val name: String = "",
    override val criteria: List<Criteria> = emptyList(),
    override val modifiers: List<Modifier> = emptyList(),
    override val triggers: List<String> = emptyList(),
    ) : ActionEntry {
    override fun execute(player: Player) {
        super.execute(player)

        Quests.completeObjective(player)
    }
}