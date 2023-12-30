package me.ahdg6.typewriter.quests.entries.fact

import com.titanborn.plugin.Quests
import me.gabber235.typewriter.adapters.Colors
import me.gabber235.typewriter.adapters.Entry
import me.gabber235.typewriter.adapters.modifiers.Help
import me.gabber235.typewriter.entry.entries.ReadableFactEntry
import me.gabber235.typewriter.facts.Fact
import me.gabber235.typewriter.utils.Icons
import org.bukkit.Bukkit
import java.util.UUID

@Entry(
    "quests_count_player_completed",
    "Count the number of completed quests MAIN and SIDE quests a player has.",
    Colors.PINK,
    Icons.ANDROID
)

class QuestCompletedBooleanFact (
    override val id: String = "",
    override val name: String = "",
    override val comment: String = "",
) : ReadableFactEntry {
    override fun read(playerId: UUID): Fact {
        return Fact(id, Quests.getTotalCompletedQuests(Bukkit.getPlayer(playerId)))
    }
}