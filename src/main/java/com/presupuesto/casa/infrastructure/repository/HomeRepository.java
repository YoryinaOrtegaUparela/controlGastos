package com.presupuesto.casa.infrastructure.repository;

import com.presupuesto.casa.infrastructure.entity.HomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomeRepository extends JpaRepository<HomeEntity, Long> {
    List<HomeEntity> findByIdentifierUser(Long identifierUSer);
    void deleteByHomeId(Long homeId);
}
