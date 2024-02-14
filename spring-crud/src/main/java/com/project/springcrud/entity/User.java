package com.project.springcrud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "age")
    private Integer age;
    
    @Column(name = "mobile")
    private String mobile;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "work")
    private String work;
    

    // Constructor, getters, and setters

    public Integer getId() {
        return id;
    }

    
    // Other getters and setters
}
