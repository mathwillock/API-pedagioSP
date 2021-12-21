package com.example.domain.carro.usecase

import com.example.domain.carro.gateway.CarroGateway
import com.example.domain.entity.GetAllCarro
import jakarta.inject.Singleton

@Singleton
class CarroAllUseCase(
    val carroGateway: CarroGateway
): CarroAll{
    override fun process(idCarro: Long): GetAllCarro {
        val carro = carroGateway.findById(idCarro)

        return GetAllCarro(carro.id, carro.modelo, carro.eixo)
    }

}