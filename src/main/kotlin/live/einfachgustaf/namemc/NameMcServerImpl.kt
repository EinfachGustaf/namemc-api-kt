package live.einfachgustaf.namemc

import io.ktor.client.request.*
import io.ktor.client.statement.*
import live.einfachgustaf.namemc.api.player.INameMcPlayer
import live.einfachgustaf.namemc.api.server.INameMcServer
import java.util.*

class NameMcServerImpl(
    private val address: String
): INameMcServer {

    override fun getAddress(): String = address

    override suspend fun getLikes(): List<INameMcPlayer> {
        val request = ktorClient.get("https://api.namemc.com/server/${getAddress()}/likes").bodyAsText()
        val decodeFromString = json.decodeFromString<List<String>>(request).map { NameMcPlayerImpl(it) }

        return decodeFromString
    }

    override suspend fun hasPlayerLiked(uuid: UUID): Boolean {
        val request = ktorClient.get("https://api.namemc.com/server/${getAddress()}/likes?profile=${uuid.toString()}").bodyAsText()

        return request.toBoolean()
    }
}