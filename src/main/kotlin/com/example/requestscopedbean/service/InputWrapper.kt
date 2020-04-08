package com.example.requestscopedbean.service

import com.example.requestscopedbean.model.InputValue
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import org.springframework.web.context.WebApplicationContext

@Component
@Scope(WebApplicationContext.SCOPE_REQUEST)
class InputWrapper {
    lateinit var inputValue: InputValue
}