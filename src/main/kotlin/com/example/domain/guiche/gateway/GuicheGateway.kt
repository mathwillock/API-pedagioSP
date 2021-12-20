package com.example.domain.guiche.gateway

import com.example.domain.guiche.entity.Guiche

interface GuicheGateway {
    fun findById(id: Long): Guiche
}