package com.example.domain.funcionario.entity

import com.example.domain.guiche.entity.Guiche
import javax.persistence.OneToMany

data class Funcionario(
    val id: Long,

    val nome: String,


)