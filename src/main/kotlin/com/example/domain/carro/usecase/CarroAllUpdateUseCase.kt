package com.example.domain.carro.usecase

import com.example.domain.carro.entity.Carro
import com.example.domain.carro.gateway.CarroGateway
import jakarta.inject.Singleton

@Singleton
class CarroAllUpdateUseCase(
    val carroGateway: CarroGateway
): CarroAllUpdate {
    override fun process(idCarro: Long, modeloCarro: String, eixosCarro: Int) {
        carroGateway.update(Carro(idCarro, modeloCarro, eixosCarro))
    }
}