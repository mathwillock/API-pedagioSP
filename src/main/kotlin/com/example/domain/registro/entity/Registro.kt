package com.example.domain.registro.entity

import java.math.BigDecimal

data class Registro(
    val id: Long,
    val idCarro: Long,
    val idGuiche: Long,
    val idFuncionario: Long,
    val valor: BigDecimal
)