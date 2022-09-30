package com.project.farmsmart.repository;

import com.project.farmsmart.entities.Buyer;
import com.project.farmsmart.entities.Cluster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClusterRepository extends JpaRepository<Cluster, Long> {
//    @Query("SELECT b FROM buyer_clusters b WHERE b.cluster = :cluster")
//    public List<Buyer> getBuyersByCluster(@Param("cluster") Long id);
}
