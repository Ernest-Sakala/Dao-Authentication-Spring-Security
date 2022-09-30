package com.project.farmsmart.repository;

import com.project.farmsmart.entities.BuyerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerTypeRepository extends JpaRepository<BuyerType, Long> {
}
