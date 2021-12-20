package com.example.application.dataprovider.carro.repository

import com.example.application.dataprovider.carro.repository.entity.Carro
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface CarroRepository: JpaRepository<Carro, Long>