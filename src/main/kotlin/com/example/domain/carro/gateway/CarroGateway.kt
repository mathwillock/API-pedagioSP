package com.example.domain.carro.gateway

import com.example.domain.carro.entity.Carro

interface CarroGateway {
    fun findById(id: Long): Carro

    fun save(carro: Carro)

    fun delete(id: Long)

}