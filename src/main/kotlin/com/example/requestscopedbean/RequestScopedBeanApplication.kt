package com.example.requestscopedbean

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RequestScopedBeanApplication

fun main(args: Array<String>) {
    runApplication<RequestScopedBeanApplication>(*args)
}
