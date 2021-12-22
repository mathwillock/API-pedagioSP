package com.example.application.entrypoint

import com.example.application.dataprovider.carro.repository.entity.CarroForm
import com.example.domain.carro.entity.Carro
import com.example.domain.carro.usecase.CarroAll
import com.example.domain.carro.usecase.CarroAllDelete
import com.example.domain.carro.usecase.CarroAllSave
import com.example.domain.carro.usecase.CarroAllUpdate
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*

@Controller("/carro")
class CarroEntrypoint(
    val carroAll: CarroAll,
    val carroAllSave: CarroAllSave,
    val carroAllDelete: CarroAllDelete,
    val carroAllUpdate: CarroAllUpdate

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

    @Delete("/deletar/{idCarro}")
    fun deleteCarro(@QueryValue idCarro: Long): String {
        val car = carroAll.process(idCarro)
        val carro = car.modeloCarro

        HttpResponse.ok(
            carroAllDelete.process(idCarro)
        )

        return "Carro $carro do id:$idCarro deletado!"
    }

    @Put("/atualizar")
    fun updateCarro(@Body carro: Carro) = HttpResponse.ok(
        carroAllUpdate.process(carro.id, carro.modelo, carro.eixo)
    )

}