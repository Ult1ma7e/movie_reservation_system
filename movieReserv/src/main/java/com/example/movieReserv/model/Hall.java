package com.example.movieReserv.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cinema_halls")
public class Hall {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, name = "total_capacity")
    private Integer totalCapacity;


    public Hall() {
    }

    public Hall(Long id, String name, Integer totalCapacity) {
        this.id = id;
        this.name = name;
        this.totalCapacity = totalCapacity;
    }

    public Long getId() {
        return id;
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

    public Integer getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
    }
}
