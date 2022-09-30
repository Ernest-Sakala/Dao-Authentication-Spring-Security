package com.project.farmsmart.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotNull
    @Column(name = "title")
    private String title;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "farmer_id")
    private Farmer farmer;
    @NotNull
    @Column(name = "price")
    private Float price;
    @NotNull
    @Column(name = "location")
    private String location;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @NotNull
    @Column(name = "created_at")
    private Date createdAt;

    public Post(Long id, String title, Farmer farmer, Product product, Float price, String location, Date createdAt) {
        this.id = id;
        this.title = title;
        this.farmer = farmer;
        this.product = product;
        this.price = price;
        this.location = location;
        this.createdAt = createdAt;
    }

    public Post() {
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

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Time createdAt) {
        this.createdAt = createdAt;
    }
}
