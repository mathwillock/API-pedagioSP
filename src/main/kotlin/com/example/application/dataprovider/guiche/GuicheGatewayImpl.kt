package com.example.application.dataprovider.guiche

import com.example.application.dataprovider.guiche.repository.GuicheRepository
import com.example.domain.guiche.entity.Guiche
import com.example.domain.guiche.gateway.GuicheGateway
import jakarta.inject.Singleton

@Singleton
class GuicheGatewayImpl(private val guicheRepository: GuicheRepository): GuicheGateway {
    override fun findById(id: Long): Guiche {
        val guiche = guicheRepository.findById(id).get()
        return Guiche(guiche.id, guiche.idFuncionario)
    }
}