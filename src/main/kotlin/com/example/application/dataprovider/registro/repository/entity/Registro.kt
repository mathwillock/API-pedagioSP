package com.example.application.dataprovider.registro.repository.entity

import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Registro(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val idCarro: Long,
    val idGuiche: Long,
    val idFuncionario: Long,
    val valor: BigDecimal
)