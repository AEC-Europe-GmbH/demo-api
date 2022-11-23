package com.aec.demoapi

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "example-api")
interface ExampleClient {

    @GetMapping("/info")
    fun getInfo(): String
}