package com.example.vaultconfig

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("example")
data class MyConfiguration (
    var username: String? = null,
    var password: String? = null
)