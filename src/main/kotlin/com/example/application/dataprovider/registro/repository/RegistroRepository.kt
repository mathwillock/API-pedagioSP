package com.example.application.dataprovider.registro.repository

import com.example.application.dataprovider.registro.repository.entity.Registro
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface RegistroRepository: JpaRepository<Registro, Long>