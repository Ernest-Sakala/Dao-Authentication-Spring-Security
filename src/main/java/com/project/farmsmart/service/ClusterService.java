package com.project.farmsmart.service;

import com.project.farmsmart.entities.Buyer;
import com.project.farmsmart.entities.Cluster;

import java.util.List;

public interface ClusterService {
    Cluster saveCluster(Cluster cluster);
    Cluster getCluster(Long id);
    List<Cluster> getAllClusters();
    Cluster updateCluster(Cluster cluster);
    void deleteClusterById(Long id);

    List<Buyer> getBuyersInCluster(Cluster cluster);
}
