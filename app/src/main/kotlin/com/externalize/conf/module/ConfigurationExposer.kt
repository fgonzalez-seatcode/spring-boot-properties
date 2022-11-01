package com.externalize.conf.module

import org.springframework.core.env.Environment
import org.springframework.stereotype.Component

@Component
class ConfigurationExposer(private val env: Environment) {

    companion object {
        val PROPERTIES_OF_INTEREST = listOf(
            "property.a",
            "property.b",
            "property.c"
        )
    }

    fun exposeConfiguration(): List<String> {
        return PROPERTIES_OF_INTEREST
            .map { Pair(it, env.getProperty(it)) }
            .map { (name, value) -> "$name: $value" }
    }

}
