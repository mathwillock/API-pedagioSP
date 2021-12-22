package com.example.application.dataprovider.funcionario.repository.entity

import com.example.domain.guiche.entity.Guiche
import javax.persistence.*

@Entity
data class FuncionarioForm(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val nome: String,
)