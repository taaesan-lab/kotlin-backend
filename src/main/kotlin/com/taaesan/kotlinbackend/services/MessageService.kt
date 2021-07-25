package com.taaesan.kotlinbackend.services

import com.taaesan.kotlinbackend.models.Message
import com.taaesan.kotlinbackend.repositories.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {
    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message) {
        db.save(message)
    }
}