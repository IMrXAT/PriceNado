package com.pricenado

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PricenadoApplication

fun main(args: Array<String>) {
    runApplication<PricenadoApplication>(*args)
}
