package com.example.domain.carro.usecase

import com.example.domain.entity.GetAllCarro

interface CarroAll {
    fun process(idCarro: Long): GetAllCarro
}