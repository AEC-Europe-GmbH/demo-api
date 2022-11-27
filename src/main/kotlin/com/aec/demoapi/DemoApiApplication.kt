package com.aec.demoapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class DemoApiApplication

fun main(args: Array<String>) {
    runApplication<DemoApiApplication>(*args)
}
