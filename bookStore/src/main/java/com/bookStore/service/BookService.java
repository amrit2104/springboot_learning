package com.bookStore.service;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service

//In Spring Framework, the @Service annotation is used to mark a class as a service component. It is a specialization of the @Component annotation, typically used in the service layer of an application to indicate that the class contains business logic.
//
//Key Features of @Service:
// 1. Service Layer Role: It is used to define a service class that handles business logic. This is typically the middle layer between the controller (which handles HTTP requests) and the repository (which handles database operations).
// 2. Dependency Injection: By marking a class with @Service, Spring will automatically detect it during component scanning and make it available for dependency injection. This means you can autowire this class into other components, such as controllers or other services.
// 3. Semantic Purpose: While technically equivalent to @Component, using @Service adds semantic clarity, indicating that the class performs business operations.
public class BookService {

    @Autowired
    // Autowire is a part of spring's dependency injection mechanism, Here, spring will automatically inject an instance of BookRepository into BookService class.
    // The @Autowired annotation injects a BookRepository (DAO layer) instance, which handles database interactions.
    private BookRepository bRepo;
    public void save(Book b)
    {
        bRepo.save(b);
        // save(b): The save() method provided by JpaRepository (or any other Spring Data repository) is called to either:
        // Insert the Book into the database if it's a new entity, or
        // Update the Book if it already exists in the database (based on its primary key).
    }

    public List<Book> getAllBook()
    {
        return bRepo.findAll();
    }

    public Book getBookById(int id) {
        return bRepo.findById(id).get(); //check what is happening here
    }

    public void deleteById(int id)
    {
        bRepo.deleteById(id);
    }
}
