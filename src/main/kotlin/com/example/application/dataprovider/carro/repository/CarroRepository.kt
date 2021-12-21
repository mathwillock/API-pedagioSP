package com.example.application.dataprovider.carro.repository

import com.example.application.dataprovider.carro.repository.entity.CarroForm
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface CarroRepository: JpaRepository<CarroForm, Long>