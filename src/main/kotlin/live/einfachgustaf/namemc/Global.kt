package live.einfachgustaf.namemc

import io.ktor.client.*
import io.ktor.client.engine.java.*
import kotlinx.serialization.json.Json

val ktorClient = HttpClient(Java)
val json = Json