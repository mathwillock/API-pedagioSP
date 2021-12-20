package com.example.application.dataprovider.carro

import com.example.application.dataprovider.carro.repository.CarroRepository
import com.example.domain.carro.entity.Carro
import com.example.domain.carro.gateway.CarroGateway
import jakarta.inject.Singleton

@Singleton
class CarroGatewayImpl(private val carroRepository: CarroRepository): CarroGateway{

    override fun findById(id: Long): Carro {
        val carro = carroRepository.findById(id).get()
        return Carro(carro.id, carro.modelo, carro.eixo)
    }

}