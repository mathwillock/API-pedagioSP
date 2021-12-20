package com.example.domain.registro.usecase

import com.example.domain.carro.gateway.CarroGateway
import com.example.domain.entity.GetAllRegistroGuicheCarro
import com.example.domain.funcionario.gateway.FuncionarioGateway
import com.example.domain.guiche.gateway.GuicheGateway
import com.example.domain.registro.gateway.RegistroGateway
import jakarta.inject.Singleton

@Singleton
class RegistroAllUseCase(
    val funcionarioGateway: FuncionarioGateway,
    val carroGateway: CarroGateway,
    val guicheGateway: GuicheGateway,
    val registroGateway: RegistroGateway,
): RegistroAll{
    override fun process(idRegistro: Long): GetAllRegistroGuicheCarro {
        val registro = registroGateway.findById(idRegistro)
        val carro = carroGateway.findById(registro.idCarro)
        val guiche = guicheGateway.findById(registro.idGuiche)
        val funcionario = funcionarioGateway.findById(registro.idFuncionario)

        return GetAllRegistroGuicheCarro(guiche.id, carro.modelo, funcionario.id, registro.valor)

    }
}