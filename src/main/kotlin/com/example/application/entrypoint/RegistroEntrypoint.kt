package com.example.application.entrypoint

import com.example.domain.registro.usecase.RegistroAll
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue

@Controller("/registro")
class RegistroEntrypoint(
    private val registroAll: RegistroAll
) {

    @Get("/{idRegistro}")
    fun getRegistro(@QueryValue idRegistro: Long) = HttpResponse.ok(registroAll.process(idRegistro))

}