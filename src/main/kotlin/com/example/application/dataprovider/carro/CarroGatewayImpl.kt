package com.example.application.dataprovider.carro

import com.example.application.dataprovider.carro.repository.CarroRepository
import com.example.application.dataprovider.carro.repository.entity.mapper.CarroMappers
import com.example.domain.carro.entity.Carro
import com.example.domain.carro.gateway.CarroGateway
import jakarta.inject.Singleton

@Singleton
class CarroGatewayImpl(
    private val carroRepository: CarroRepository,
    private val carroMappers: CarroMappers
): CarroGateway{

    override fun findById(id: Long): Carro =
        carroMappers.toDomain(carroRepository.findById(id).get())


    override fun save(carro: Carro): Unit {
        carroRepository.save(carroMappers.toApplication(carro))
    }

    override fun delete(id: Long) {
        carroRepository.delete(carroRepository.findById(id).get())

    }

    override fun update(carro: Carro): Unit {

//        val carroForm = CarroForm(carro.id, carro.modelo, carro.eixo)
////        Só chamar o save aqui
//        val carro = carroRepository.findById(carroForm.id).get()
//
//        val message: String = if(carro != null) {
//            carroRepository.update(carro)
//            "O carro do id:${carro.id} foi atualizado."
//        } else {
//            "O carro do id:${carro.id} Não foi encontrado, revise o id."
//        }
//
//        return message

        carroRepository.save(carroMappers.toApplication(carro))




    }


}