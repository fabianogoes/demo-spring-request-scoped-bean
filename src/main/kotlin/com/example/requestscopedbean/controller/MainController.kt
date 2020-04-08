package com.example.requestscopedbean.controller

import com.example.requestscopedbean.model.InputValue
import com.example.requestscopedbean.service.InputWrapper
import com.example.requestscopedbean.service.MainService
import com.example.requestscopedbean.model.PayloadDTO
import org.springframework.web.bind.annotation.*
import javax.inject.Provider

@RestController
@RequestMapping("/")
class MainController(private val input: Provider<InputWrapper>, private val service: MainService) {

    @PostMapping
    fun post(@RequestBody payload: PayloadDTO) {
        input.get().inputValue = mapperToVo(payload)
        service.execute()
    }

    fun mapperToVo(payload: PayloadDTO) = InputValue(name = payload.name, age = payload.age, date = payload.referenceDate)
}