package com.example.restservicecors

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.config.annotation.*

@SpringBootApplication
class RestServiceCorsApplication {

    @Bean
    fun corsConfigurer(): WebMvcConfigurer {
        return object : WebMvcConfigurer {
            override fun addCorsMappings(registry: CorsRegistry) {
                registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:8080")
            }
        }
    }
}

fun main(args: Array<String>) {
    runApplication<RestServiceCorsApplication>(*args)
}
