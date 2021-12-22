package com.example.application.dataprovider.guiche

import com.example.application.dataprovider.guiche.repository.GuicheRepository
import com.example.application.dataprovider.guiche.repository.entity.mapper.GuicheMappers
import com.example.domain.guiche.entity.Guiche
import com.example.domain.guiche.gateway.GuicheGateway
import jakarta.inject.Singleton

@Singleton
class GuicheGatewayImpl(
    private val guicheRepository: GuicheRepository,
    private val guicheMappers: GuicheMappers
): GuicheGateway {
    override fun findById(id: Long): Guiche =
        guicheMappers.toDomain(guicheRepository.findById(id).get())




}