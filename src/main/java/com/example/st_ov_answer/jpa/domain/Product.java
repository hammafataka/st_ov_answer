package com.example.st_ov_answer.jpa.domain;

import java.util.List;

import javax.persistence.*;

/**
 * @author HAMMA FATAKA (mfataka@monetplus.cz)
 * @project st_ov_answer
 * @date 09.04.2023 2:50
 */
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "name")
    private String name;

    private String description;

    @OneToMany(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "product_id")
    private List<Comment> comments;

    public Product() {
    }

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Product(String name, String description, List<Comment> comments) {
        this.name = name;
        this.description = description;
        this.comments = comments;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
