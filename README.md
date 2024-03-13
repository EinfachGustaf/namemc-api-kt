[![](https://jitci.com/gh/EinfachGustaf/namemc-api-kt/svg)](https://jitci.com/gh/EinfachGustaf/namemc-api-kt)

# namemc-api-kt
An easy to use api for Kotlin interacting with [NameMC](https://namemc.com)

## Example
```kotlin
import live.einfachgustaf.namemc.NameMcApiImpl
import live.einfachgustaf.namemc.api.NameMcApi
import java.util.*

suspend fun main() {
    NameMcApi.setGlobalInstance(NameMcApiImpl())

    NameMcApi.getInstance().getServerByAddress("einfachgustaf.live").getLikes().forEach { 
        println(it.getUuid())
    }

    val hasPlayerLiked = NameMcApi.getInstance().getServerByAddress("einfachgustaf.live")
        .hasPlayerLiked(UUID.fromString("72ccbc0c-a35f-4492-2450-971a26607ee0"))

    println(hasPlayerLiked)
}
```

## Dependencies
```kotlin

repositories {
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.EinfachGustaf:namemc-api-kt:Tag")
}

```