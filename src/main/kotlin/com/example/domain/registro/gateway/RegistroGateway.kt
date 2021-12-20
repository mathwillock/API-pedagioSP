package com.example.domain.registro.gateway

import com.example.domain.registro.entity.Registro

interface RegistroGateway  {
    fun findById(id: Long): Registro
}