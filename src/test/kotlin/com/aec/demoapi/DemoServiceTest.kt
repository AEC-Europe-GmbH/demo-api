package com.aec.demoapi

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
internal class DemoServiceTest {
    @InjectMocks
    lateinit var demoService: DemoService

    @Test
    internal fun it_should_add_two_to_the_number() {
        //given
        val number = 5

        //when
        val newNumber = demoService.plusTwo(number)

        //then
        assertThat(newNumber).isEqualTo(7)
    }
}