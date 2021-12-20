package com.example.application.dataprovider.guiche.repository

import com.example.application.dataprovider.guiche.repository.entity.Guiche
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface GuicheRepository: JpaRepository<Guiche, Long>