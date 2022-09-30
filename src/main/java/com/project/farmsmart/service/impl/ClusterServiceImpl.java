package com.project.farmsmart.service.impl;

import com.project.farmsmart.entities.Buyer;
import com.project.farmsmart.entities.Cluster;
import com.project.farmsmart.repository.BuyerRepository;
import com.project.farmsmart.repository.ClusterRepository;
import com.project.farmsmart.service.ClusterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClusterServiceImpl implements ClusterService {

    @Autowired
    private ClusterRepository clusterRepository;

    @Autowired
    private BuyerRepository buyerRepository;

    public ClusterServiceImpl(ClusterRepository clusterRepository) {
        this.clusterRepository = clusterRepository;
    }


    @Override
    public Cluster saveCluster(Cluster cluster) {
        return clusterRepository.save(cluster);
    }

    @Override
    public Cluster getCluster(Long id) {
        return clusterRepository.findById(id).get();
    }

    @Override
    public List<Cluster> getAllClusters() {
        return clusterRepository.findAll();
    }

    @Override
    public Cluster updateCluster(Cluster cluster) {
        return clusterRepository.save(cluster);
    }

    @Override
    public void deleteClusterById(Long id) {
        clusterRepository.deleteById(id);
    }

    @Override
    public List<Buyer> getBuyersInCluster(Cluster cluster) {

        return null;
    }
}
