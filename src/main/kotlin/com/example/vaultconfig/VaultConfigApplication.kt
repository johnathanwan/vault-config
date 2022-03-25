package com.example.vaultconfig

import mu.*
import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.boot.context.properties.*
import org.springframework.context.annotation.*
import org.springframework.vault.core.VaultKeyValueOperationsSupport
import org.springframework.vault.core.VaultTemplate


@SpringBootApplication
@EnableConfigurationProperties(MyConfiguration::class)
class VaultConfigApplication {

    @Bean
    fun run(configuration: MyConfiguration, vaultTemplate: VaultTemplate): CommandLineRunner {
        return CommandLineRunner {

            val logger = KotlinLogging.logger {}

            logger.info { "----------------------------------" }
            logger.info { "Configuration properties" }
            logger.info { " example.username is ${configuration.username}" }
            logger.info { " example.password is ${configuration.password}" }
            logger.info { "----------------------------------" }
        }
    }
}

fun main(args: Array<String>) {
    runApplication<VaultConfigApplication>(*args)
}
