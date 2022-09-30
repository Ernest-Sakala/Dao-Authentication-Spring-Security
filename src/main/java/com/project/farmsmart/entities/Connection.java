package com.project.farmsmart.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "connection")
public class Connection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "farmer_id")
    private Farmer farmerID;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "buyer_id")
    private Buyer buyerID;

    @Column(name = "created_at")
    private Date createdAt;

    public Connection(Long id, Farmer farmerID, Buyer buyerID, Date createdAt) {
        this.id = id;
        this.farmerID = farmerID;
        this.buyerID = buyerID;
        this.createdAt = createdAt;
    }

    public Connection() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Farmer getFarmerID() {
        return farmerID;
    }

    public void setFarmerID(Farmer farmerID) {
        this.farmerID = farmerID;
    }

    public Buyer getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(Buyer buyerID) {
        this.buyerID = buyerID;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
