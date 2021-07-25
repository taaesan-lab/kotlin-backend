package com.taaesan.kotlinbackend.movies

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MoviesController {

    @GetMapping
    fun index(): List<Message> = listOf(
            Message("1", "Hello!"),
            Message("2", "Bonjour!"),
            Message("3", "Privet!"),
    )

}

data class Message(val id: String?, val text: String);