package com.aec.demoapi

import org.springframework.stereotype.Service

@Service
class DemoService {

    fun plusTwo(number: Int): Int {
        return number + 2
    }
}