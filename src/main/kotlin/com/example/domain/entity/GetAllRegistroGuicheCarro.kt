package com.example.domain.entity

import java.math.BigDecimal

data class GetAllRegistroGuicheCarro(
    val idGuiche: Long,
    val modeloCarro: String,
    val idFuncionario: Long,
    val valor: BigDecimal
)