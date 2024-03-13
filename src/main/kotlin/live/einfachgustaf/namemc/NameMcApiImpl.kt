package live.einfachgustaf.namemc

import live.einfachgustaf.namemc.api.NameMcApi
import live.einfachgustaf.namemc.api.server.INameMcServer

class NameMcApiImpl: NameMcApi() {

    override fun getServerByAddress(address: String): INameMcServer {
        return NameMcServerImpl(address)
    }
}