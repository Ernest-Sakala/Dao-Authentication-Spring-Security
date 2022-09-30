package com.project.farmsmart.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "product_category")
    private ProductCategory productCategory;

    @ManyToOne
    @JoinColumn(name = "product_type")
    private ProductType productType;

    @ManyToOne
    @JoinColumn(name = "farmer_id")
    private Farmer farmerID;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Post> posts;

    public Product(Long id, String name, ProductCategory productCategory, ProductType productType) {
        this.id = id;
        this.name = name;
        this.productCategory = productCategory;
        this.productType = productType;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public Farmer getFarmerID() {
        return farmerID;
    }

    public void setFarmerID(Farmer farmerID) {
        this.farmerID = farmerID;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

}
