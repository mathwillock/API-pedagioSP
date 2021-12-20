package com.example.application.dataprovider.registro

import com.example.application.dataprovider.registro.repository.RegistroRepository
import com.example.domain.registro.entity.Registro
import com.example.domain.registro.gateway.RegistroGateway
import jakarta.inject.Singleton

@Singleton
class RegistroGatewayImpl(
    private val registroRepository: RegistroRepository): RegistroGateway {

    override fun findById(id: Long): Registro {
        val registro = registroRepository.findById(id).get()
        return Registro(registro.id, registro.idCarro, registro.idGuiche, registro.idFuncionario, registro.valor)
    }
}