package live.einfachgustaf.namemc.api

import live.einfachgustaf.namemc.api.server.INameMcServer

abstract class NameMcApi {

    companion object {
        private lateinit var instance: NameMcApi

        fun getInstance() = instance

        fun setGlobalInstance(value: NameMcApi) {
            instance = value
        }

        fun useInstance(value: NameMcApi): NameMcApi = value
    }

    abstract fun getServerByAddress(address: String): INameMcServer
}