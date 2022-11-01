package com.externalize.conf.module

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ModuleApplication

fun main(args: Array<String>) {
	runApplication<ModuleApplication>(*args)
}
