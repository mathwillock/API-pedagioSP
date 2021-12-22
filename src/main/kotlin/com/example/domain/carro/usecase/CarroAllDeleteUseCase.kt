package com.example.domain.carro.usecase

import com.example.domain.carro.gateway.CarroGateway
import jakarta.inject.Singleton

@Singleton
class CarroAllDeleteUseCase(
    val carroGateway: CarroGateway
): CarroAllDelete {
    override fun process(idCarro: Long) {
        carroGateway.delete(idCarro)
    }
}