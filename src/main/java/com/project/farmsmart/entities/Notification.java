package com.project.farmsmart.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "farmer")
    private Farmer farmer;

    @ManyToOne
    @JoinColumn(name = "buyer")
    private Buyer buyer;

    @Column(name = "created_at")
    private Date createdAt;

    public Notification(Long id, String title, String description, Farmer farmer, Buyer buyer, Date createdAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.farmer = farmer;
        this.buyer = buyer;
        this.createdAt = createdAt;
    }

    public Notification() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Farmer getFromUser() {
        return farmer;
    }

    public void setFromUser(User fromUser) {
        this.farmer = farmer;
    }

    public Buyer getToUser() {
        return buyer;
    }

    public void setToUser(User toUser) {
        this.buyer = buyer;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
