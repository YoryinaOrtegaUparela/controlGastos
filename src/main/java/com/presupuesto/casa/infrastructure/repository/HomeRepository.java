package com.presupuesto.casa.infrastructure.repository;

import com.presupuesto.casa.infrastructure.entity.HomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<HomeEntity, Long> {
}
