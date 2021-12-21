package com.example.application.entrypoint

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class HelloEntrypoint {

    @Get
    fun Hello() = HttpResponse.ok("Hello World with Kotlin!")

    @Get("/ping")
    fun index() = HttpResponse.ok("pong")
}