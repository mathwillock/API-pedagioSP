package com.example.domain.carro.usecase

interface CarroAllUpdate {
    fun process(idCarro: Long, modeloCarro: String, eixosCarro: Int)
}