package com.example.requestscopedbean.repository

import com.example.requestscopedbean.service.InputWrapper
import org.springframework.stereotype.Repository
import javax.inject.Provider

@Repository
class MainRepository(private val input: Provider<InputWrapper>) {

    fun find() {
        println("<<< Repository >>>")
        println("name: ${input.get().inputValue.name}")
        println("age: ${input.get().inputValue.age}")
        println("date: ${input.get().inputValue.date}")
    }
}