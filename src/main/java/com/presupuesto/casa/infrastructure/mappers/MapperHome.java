package com.presupuesto.casa.infrastructure.mappers;

import com.presupuesto.casa.domain.models.Home;
import com.presupuesto.casa.infrastructure.entity.HomeEntity;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper
public interface MapperHome {
    List<Home> homeEntityListToHomeList(List<HomeEntity> listHomeEntity);
    Home homeEntityToHome(HomeEntity listHomeEntity);
    HomeEntity homeToHomeEntity(Home home);
}
