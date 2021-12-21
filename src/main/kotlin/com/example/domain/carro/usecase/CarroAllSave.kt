package com.example.domain.carro.usecase

interface CarroAllSave {
    fun process(idCarro: Long, modeloCarro: String, eixosCarro: Int)

}