package com.example.domain.carro.usecase

import com.example.domain.carro.entity.Carro
import com.example.domain.carro.gateway.CarroGateway
import jakarta.inject.Singleton

@Singleton
class CarroAllSaveUseCase(
    val carroGateway: CarroGateway
): CarroAllSave {
    override fun process(idCarro: Long, modeloCarro: String, eixosCarro: Int) {
        carroGateway.save(Carro(idCarro, modeloCarro, eixosCarro))
    }


}