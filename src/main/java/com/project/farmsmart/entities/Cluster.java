package com.project.farmsmart.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "clusters")
public class Cluster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "centroid_x")
    private Float centroidX;

    @Column(name = "centroid_y")
    private Float centroidY;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "clusters")
    private List<Buyer> buyers;

    public Cluster() {
    }

    public Cluster(Long id, Float centroidX, Float centroidY, String name) {
        this.id = id;
        this.centroidX = centroidX;
        this.centroidY = centroidY;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getCentroidX() {
        return centroidX;
    }

    public void setCentroidX(Float centroidX) {
        this.centroidX = centroidX;
    }

    public Float getCentroidY() {
        return centroidY;
    }

    public void setCentroidY(Float centroidY) {
        this.centroidY = centroidY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Buyer> getBuyers() {
        return buyers;
    }

    public void setBuyers(List<Buyer> buyers) {
        this.buyers = buyers;
    }
}
