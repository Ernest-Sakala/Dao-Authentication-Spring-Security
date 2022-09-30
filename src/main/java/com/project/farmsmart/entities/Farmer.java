package com.project.farmsmart.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "farmer_id")
@Table(name = "farmers")
public class Farmer  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "farmer_id")
    private Long id;

    @OneToMany(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private List<User> users;

    @OneToMany(mappedBy = "farmerID")
    private List<Product> products;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @OneToMany(mappedBy = "farmer")
    private List<Post> posts;

    @ManyToOne(targetEntity = ProductCategory.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "speciality", nullable = false)
    private ProductCategory speciality;



    public Farmer() {}
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public ProductCategory getSpeciality() {
        return speciality;
    }

    public void setSpeciality(ProductCategory speciality) {
        this.speciality = speciality;
    }


}
