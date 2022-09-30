package com.project.farmsmart.repository;

import com.project.farmsmart.entities.Connection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionsRepository extends JpaRepository<Connection, Long> {
}
