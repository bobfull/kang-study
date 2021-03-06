package com.mircoservices.study

import com.mircoservices.study.Interface.ServiceInterface
import org.springframework.beans.factory.annotation.Value


class ExampleService : ServiceInterface {
    @Value(value = "\${service.message.text}")
    private lateinit var text: String

    override fun getHello(name : String) = "$text $name"
}