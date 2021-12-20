package com.example.domain.funcionario.gateway

import com.example.domain.funcionario.entity.Funcionario

interface FuncionarioGateway {
    fun findById(id: Long): Funcionario
}