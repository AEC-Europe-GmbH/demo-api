package com.aec.demoapi

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController(
    private val exampleClient: ExampleClient,
    private val demoService: DemoService
) {

    @Value("\${example.prop.from.yml}")
    private var value: String = "default value"

    @GetMapping
    fun hello(): String {
        return "hello $value"
    }

    @GetMapping("/example")
    fun getExampleInfo(): String {
        return "demo api response: ${exampleClient.getInfo()}"
    }

    @GetMapping("/number/{num}")
    fun getNewNumber(@PathVariable("num") num: Int): Int {
        return demoService.plusTwo(num)
    }
}