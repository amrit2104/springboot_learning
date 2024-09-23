package com.bookStore.entity;

import jakarta.persistence.*;

@Entity
// In Spring Boot, the @Entity annotation is used to mark a class as a JPA (Java Persistence API) entity, which means that it is a persistent Java object mapped to a database table. It indicates that the class will be managed by JPA for database operations like CRUD.
// Key Features of @Entity:
// 1. Database Table Mapping: The @Entity annotation tells JPA that the class should be treated as a table in the database, and its fields should be treated as columns.
// 2. Primary Key: Every @Entity class must have a primary key, typically annotated with @Id.
// 3. Automatic Table Generation: JPA can automatically create the corresponding table in the database if configured.
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //this is used to autoincrement the id.
    private int id;
    private String name;
    private String author;
    private String price;

    public Book(int id, String name, String author, String price) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
