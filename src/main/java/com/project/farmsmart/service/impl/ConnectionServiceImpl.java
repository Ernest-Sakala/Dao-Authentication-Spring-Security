package com.project.farmsmart.service.impl;

import com.project.farmsmart.entities.Connection;
import com.project.farmsmart.repository.BuyerRepository;
import com.project.farmsmart.repository.ConnectionsRepository;
import com.project.farmsmart.repository.FarmerRepository;
import com.project.farmsmart.service.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnectionServiceImpl implements ConnectionService {

    @Autowired
    private ConnectionsRepository connectionsRepository;

    @Autowired
    private BuyerRepository buyerRepository;

    @Autowired
    private FarmerRepository farmerRepository;

    public ConnectionServiceImpl(ConnectionsRepository connectionsRepository, BuyerRepository buyerRepository, FarmerRepository farmerRepository) {
        this.connectionsRepository = connectionsRepository;
        this.buyerRepository = buyerRepository;
        this.farmerRepository = farmerRepository;
    }


    @Override
    public Connection saveConnection(Connection connection) {
        return connectionsRepository.save(connection);
    }

    @Override
    public Connection getConnection(Long id) {
        return connectionsRepository.findById(id).get();
    }

    @Override
    public List<Connection> getAllConnections() {
        return connectionsRepository.findAll();
    }

    @Override
    public Connection updateConnection(Connection connection) {
        return connectionsRepository.save(connection);
    }

    @Override
    public void deleteConnectionById(Long id) {
        connectionsRepository.deleteById(id);
    }
}
