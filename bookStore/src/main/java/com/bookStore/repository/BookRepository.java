package com.bookStore.repository;
import  com.bookStore.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository is a part of Spring Data JPA, an abstraction that simplifies data access and database operations in Spring Boot applications. It provides CRUD (Create, Read, Update, Delete) operations out of the box and eliminates the need for writing common data access logic.
//
//Key Features of JpaRepository:
// 1. Basic CRUD Operations: It includes methods for standard operations like saving, updating, deleting, and finding entities in a database.
// 2. Pagination and Sorting: It provides methods to retrieve entities with pagination and sorting.
// 3. Custom Query Methods: You can define custom queries by following naming conventions or using annotations.
// 4. Inheritance: JpaRepository extends two other interfaces: CrudRepository and PagingAndSortingRepository.

@Repository
//In Spring Framework, the @Repository annotation is used to mark a class as a Data Access Object (DAO), which is responsible for interacting with the database. It is part of the persistence layer and is typically used with Spring Data JPA, JDBC, or other persistence technologies to encapsulate data retrieval, storage, and search logic.
//
//Key Features of @Repository:
//1. Persistence Layer Role: It indicates that the class is responsible for database operations such as queries, inserts, updates, and deletes.
//2. Exception Translation: One of the main advantages of using @Repository is that Spring will automatically translate database-related exceptions (like SQLException) into Spring's DataAccessException hierarchy, which makes exception handling more uniform.
//3. Component Scanning: Like @Component, the @Repository annotation makes the class eligible for component scanning, meaning Spring will detect and register the class as a Spring bean, allowing it to be autowired in other parts of the application.
public interface BookRepository extends JpaRepository<Book, Integer>
{

}