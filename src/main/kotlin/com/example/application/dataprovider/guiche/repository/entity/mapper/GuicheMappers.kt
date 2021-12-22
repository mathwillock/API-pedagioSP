package com.example.application.dataprovider.guiche.repository.entity.mapper

import com.example.application.dataprovider.funcionario.repository.FuncionarioRepository
import com.example.application.dataprovider.funcionario.repository.entity.FuncionarioForm
import com.example.application.dataprovider.guiche.repository.entity.GuicheForm
import com.example.domain.guiche.entity.Guiche
import jakarta.inject.Inject
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Named

@Mapper
abstract class GuicheMappers {

    @Inject
    lateinit var funcionarioRepository: FuncionarioRepository

    @Mapping( target = "idFuncionario", source = "funcionario", qualifiedByName = ["getFuncionarioById"] )
    abstract fun toDomain(guicheForm: GuicheForm): Guiche

    @Named("getFuncionarioById")
    fun getFuncionarioById(idFuncionario: Long) =
        funcionarioRepository.findById(idFuncionario).get()

    @Mapping( target = "funcionario", source = "idFuncionario", qualifiedByName = ["getIdByFuncionario"] )
    abstract fun ToApplication(guiche: Guiche): GuicheForm

    @Named("getIdByFuncionario")
    fun getIdByFuncionario(funcionario: FuncionarioForm) = funcionario.id


}