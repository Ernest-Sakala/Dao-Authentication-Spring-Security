package com.project.farmsmart.service;

import com.project.farmsmart.entities.Connection;

import java.util.List;

public interface ConnectionService {
    Connection saveConnection(Connection connection);
    Connection getConnection(Long id);
    List<Connection> getAllConnections();
    Connection updateConnection(Connection connection);
    void deleteConnectionById(Long id);
}
