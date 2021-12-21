package com.example.application.entrypoint

import com.example.application.dataprovider.carro.repository.entity.CarroForm
import com.example.domain.carro.usecase.CarroAll
import com.example.domain.carro.usecase.CarroAllSave
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*

@Controller("/carro")
class CarroEntrypoint(
    val carroAll: CarroAll,
    val carroAllSave: CarroAllSave
) {

    @Get("/{idCarro}")
    fun getCarro(@QueryValue idCarro: Long) = HttpResponse.ok(
        carroAll.process(idCarro)
    )

    @Post("/salvar")
    fun saveCarro(@Body carro: CarroForm): String {
         HttpResponse.created(
            carroAllSave.process(carro.id, carro.modelo, carro.eixo)
         )

        return "${carro.modelo} salvo!"
    }

}