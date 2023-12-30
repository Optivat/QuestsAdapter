package me.ahdg6.typewriter.quests.entries.action

import com.titanborn.plugin.Quests
import me.gabber235.typewriter.adapters.Colors
import me.gabber235.typewriter.adapters.Entry
import me.gabber235.typewriter.entry.Criteria
import me.gabber235.typewriter.entry.Modifier
import me.gabber235.typewriter.entry.entries.ActionEntry
import me.gabber235.typewriter.utils.Icons
import org.bukkit.entity.Player


@Entry("quest_completion", "Completes a QUEST OBJECTIVE for the player.", Colors.ORANGE, Icons.OIL_CAN)
/**
 * The `Despawn Mob Action` action removes MythicMobs mobs from the world.
 *
 * ## How could this be used?
 *
 * This action could be used in stories or quests in various ways. For instance, if a player fails a quest to kill 10 zombies, then the zombies could be despawned to signal that the quest is no longer active. One could even use this action for a quest to kill a certain amount of mobs within a time limit!
 */
class CompleteQuestActionEntry (
    override val id: String = "",
    override val name: String = "",
    override val criteria: List<Criteria> = emptyList(),
    override val modifiers: List<Modifier> = emptyList(),
    override val triggers: List<String> = emptyList(),
) : ActionEntry {
    override fun execute(player: Player) {
        super.execute(player)

        Quests.completeQuest(player)
    }
}