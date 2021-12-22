package com.example.application.dataprovider.carro

import com.example.application.dataprovider.carro.repository.CarroRepository
import com.example.application.dataprovider.carro.repository.entity.CarroForm
import com.example.domain.carro.entity.Carro
import com.example.domain.carro.gateway.CarroGateway
import jakarta.inject.Singleton

@Singleton
class CarroGatewayImpl(private val carroRepository: CarroRepository): CarroGateway{

    override fun findById(id: Long): Carro {
        val carro = carroRepository.findById(id).get()
        return Carro(carro.id, carro.modelo, carro.eixo)
    }

    override fun save(carro: Carro) {
        val carroForm = CarroForm(carro.id, carro.modelo, carro.eixo)

        carroRepository.save(carroForm)

    }

    override fun delete(id: Long) {
        val carro = carroRepository.findById(id).get()

        carroRepository.delete(carro)
    }


}