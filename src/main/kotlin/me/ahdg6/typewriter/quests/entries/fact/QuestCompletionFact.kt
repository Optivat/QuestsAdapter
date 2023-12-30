package me.ahdg6.typewriter.quests.entries.fact

import com.titanborn.plugin.PlayerQuestInfo
import com.titanborn.plugin.QuestLog
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
    "quests_quest_player_completed",
    "Checks if the player completed a quest, 1 = TRUE, 0 = FALSE",
    Colors.PINK,
    Icons.QUESTION
)

class QuestCompletionFact (
    override val id: String = "",
    override val name: String = "",
    override val comment: String = "",
    @Help("Quest Name (Case Sensitive)")
    val questName: String = "",
    val main: Boolean = false,
) : ReadableFactEntry {
    override fun read(playerId: UUID): Fact {
        return Fact(id, Quests.checkIfQuestIsCompleted(playerId, questName, main))
    }
}