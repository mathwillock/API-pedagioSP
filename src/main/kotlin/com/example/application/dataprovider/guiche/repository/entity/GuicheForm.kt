package com.example.application.dataprovider.guiche.repository.entity

import com.example.application.dataprovider.funcionario.repository.entity.FuncionarioForm
import javax.persistence.*

@Entity
data class GuicheForm (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @ManyToOne
    val funcionario: FuncionarioForm,
)



