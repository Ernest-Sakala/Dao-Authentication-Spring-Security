package com.project.farmsmart.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "buyer_id")
@Table(name = "buyers")
public class Buyer  {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "buyer_id")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "buyer_type")
    private BuyerType buyerType;

    @OneToMany(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @ManyToMany
    @JoinTable(name = "buyer_clusters",
            joinColumns = {@JoinColumn(name = "buyer_id")},
            inverseJoinColumns = {@JoinColumn(name = "cluster_id")})
    private List<Cluster> clusters;

    @OneToMany
    private List<Connection> connections;

    public Buyer(BuyerType buyerType) {
        this.buyerType = buyerType;
    }


    public Buyer() {
    }
    public BuyerType getBuyerType() {
        return buyerType;
    }

    public void setBuyerType(BuyerType buyerType) {
        this.buyerType = buyerType;
    }

    public List<Connection> getConnections() {
        return connections;
    }

    public void setConnections(List<Connection> connections) {
        this.connections = connections;
    }

    public List<Cluster> getClusters() {
        return clusters;
    }

    public void setClusters(List<Cluster> clusters) {
        this.clusters = clusters;
    }
}
