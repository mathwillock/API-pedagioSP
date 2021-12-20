package com.example.domain.registro.usecase

import com.example.domain.entity.GetAllRegistroGuicheCarro

interface RegistroAll {
    fun process(idRegistro: Long): GetAllRegistroGuicheCarro
}