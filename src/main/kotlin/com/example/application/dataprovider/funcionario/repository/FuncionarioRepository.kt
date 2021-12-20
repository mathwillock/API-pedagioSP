package com.example.application.dataprovider.funcionario.repository

import com.example.application.dataprovider.funcionario.repository.entity.Funcionario
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface FuncionarioRepository: JpaRepository<Funcionario, Long>