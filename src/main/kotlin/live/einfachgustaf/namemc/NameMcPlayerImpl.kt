package live.einfachgustaf.namemc

import live.einfachgustaf.namemc.api.player.INameMcPlayer
import java.util.*

class NameMcPlayerImpl(
    private val uuid: String
): INameMcPlayer {
    override fun getUuid(): UUID {
        return UUID.fromString(uuid)
    }
}