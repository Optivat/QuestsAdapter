package me.ahdg6.typewriter.quests.entries.event

import com.titanborn.plugin.events.custom.QuestEndEvent
import me.gabber235.typewriter.adapters.Colors
import me.gabber235.typewriter.adapters.Entry
import me.gabber235.typewriter.adapters.modifiers.Help
import me.gabber235.typewriter.entry.EntryListener
import me.gabber235.typewriter.entry.Query
import me.gabber235.typewriter.entry.entries.EventEntry
import me.gabber235.typewriter.entry.triggerAllFor
import me.gabber235.typewriter.utils.Icons
import org.bukkit.entity.Player


@Entry("on_quest_end", "When a player ends a Quest.", Colors.YELLOW, Icons.BOOK)
/**
 * The `Mob Death Event` event is triggered when a player kill a mob.
 *
 * ## How could this be used?
 *
 * After killing a final boss, a dialogue or cinematic section can start. The player could also get a special reward the first time they kill a specific mob.
 */
class QuestEndEventEntry (
    override val id: String = "",
    override val name: String = "",
    override val triggers: List<String> = emptyList(),
    @Help("Only trigger when a specific quest gets selected.")
    val questName: String = "",
) : EventEntry

@EntryListener(QuestEndEventEntry::class)
fun QuestEndEvent(event: QuestEndEvent, query: Query<QuestEndEventEntry>) {
    val player = event.player as? Player ?: return
    query findWhere {event.questName == it.questName } triggerAllFor player
}
