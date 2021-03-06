package com.taaesan.kotlinbackend

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBackendApplication

fun main(args: Array<String>) {
    runApplication<KotlinBackendApplication>(*args){
        setBannerMode(Banner.Mode.OFF)
    }
}
