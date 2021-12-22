package com.example.application.dataprovider.carro.repository.entity.mapper

import com.example.application.dataprovider.carro.repository.entity.CarroForm
import com.example.domain.carro.entity.Carro
import org.mapstruct.Mapper

@Mapper
interface CarroMappers {

    fun toDomain(carroForm: CarroForm): Carro

    fun toApplication(carro: Carro): CarroForm

}