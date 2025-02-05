package com.presupuesto.casa.infrastructure.mappers;

import com.presupuesto.casa.domain.models.Expense;
import com.presupuesto.casa.domain.models.Home;
import com.presupuesto.casa.domain.models.Person;
import com.presupuesto.casa.infrastructure.entity.ExpenseEntity;
import com.presupuesto.casa.infrastructure.entity.HomeEntity;
import com.presupuesto.casa.infrastructure.entity.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperHome {
    List<Home> homeEntityListToHomeList(List<HomeEntity> listHomeEntity);
    Home homeEntityToHome(HomeEntity homeEntity);
    HomeEntity homeToHomeEntity(Home home);
}
