package com.example.application.dataprovider.funcionario

import com.example.application.dataprovider.funcionario.repository.FuncionarioRepository
import com.example.domain.funcionario.entity.Funcionario
import com.example.domain.funcionario.gateway.FuncionarioGateway
import jakarta.inject.Singleton

@Singleton
class FuncionarioGatewayImpl(private val funcionarioRepository: FuncionarioRepository ): FuncionarioGateway{
    override fun findById(id: Long): Funcionario {
        val funcionario = funcionarioRepository.findById(id).get()
        return Funcionario(funcionario.id, funcionario.nome)
    }
}