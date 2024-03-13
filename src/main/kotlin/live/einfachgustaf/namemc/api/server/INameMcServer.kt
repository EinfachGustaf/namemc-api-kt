package live.einfachgustaf.namemc.api.server

import live.einfachgustaf.namemc.api.player.INameMcPlayer
import java.util.UUID

interface INameMcServer {
    fun getAddress(): String

    suspend fun getLikes(): List<INameMcPlayer>

    suspend fun hasPlayerLiked(uuid: UUID): Boolean
}