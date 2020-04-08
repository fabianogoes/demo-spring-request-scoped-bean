package com.example.requestscopedbean.service

import com.example.requestscopedbean.repository.MainRepository
import org.springframework.stereotype.Service
import javax.inject.Provider

@Service
class MainService(private val input: Provider<InputWrapper>, private val repository: MainRepository) {

    fun execute() {
        println("<<< Service >>>")
        println("name: ${input.get().inputValue.name}")
        println("age: ${input.get().inputValue.age}")
        println("date: ${input.get().inputValue.date}")
        repository.find()
    }
}
