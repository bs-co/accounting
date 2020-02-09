package com.bs.bees.accounting.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

data class Message(val text: String, val priority: String)

@RestController
class ApiController {

    @GetMapping("/api")
    fun api(): Message {
        return Message("Hello from Accounting api ", "High")
    }
}