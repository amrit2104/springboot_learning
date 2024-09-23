package com.bookStore.controller;

import org.springframework.ui.Model;
import com.bookStore.entity.Book;
import com.bookStore.entity.MyBookList;
import com.bookStore.service.BookService;
import com.bookStore.service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller //this annotation is added to indicate this class belongs to controller.
public class BookController
{
    @Autowired
    private BookService service;

    @Autowired
    private MyBookListService myBookService;

    @GetMapping("/")
//    In Spring Boot, the @GetMapping annotation is used to map HTTP GET requests to specific handler methods within a controller. It is a specialized version of the more generic @RequestMapping annotation, which can map different types of HTTP requests
//    Key Features of @GetMapping:
//    1. Method Mapping: It maps a particular URL to a method in a Spring controller. When the mapped URL is accessed using a GET request, the corresponding method will be invoked.
//    2. Path Variables and Query Parameters: You can use path variables or query parameters to capture dynamic values from the URL.
//    3. Return Types: The method typically returns a String, ResponseEntity, or other types, often used for returning JSON data or rendering views.
    public String home(){
        return "home";
    }

    @GetMapping("/book_register")
    public String bookRegister(){
        return "bookRegister";
    }

    @GetMapping("/available_books")
    public ModelAndView getAllBook(){
        List<Book> list = service.getAllBook();
//        ModelAndView m = new ModelAndView();
//        m.setViewName("bookList");
//        m.addObject("book", list);
//        return m;
// Check what is happening here
        return new ModelAndView("bookList", "book", list);
    }

    @GetMapping("/my_books")
    public String myBooks(Model model){
        List<MyBookList> list = myBookService.getAllMyBooks();
        model.addAttribute("book",list);
        return "myBooks";
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b)
    {
        service.save(b);
        return "redirect:/available_books";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id) {
        Book b = service.getBookById(id);
        MyBookList mb = new MyBookList(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
        myBookService.saveMyBooks(mb);
        return "redirect:/my_books";
    }

    @RequestMapping("/editBook/{id}")
    public String editBook(@PathVariable("id") int id, Model model)
    {
        Book b=service.getBookById(id);
        model.addAttribute("book",b);
        return "bookEdit";
    }

    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") int id)
    {
        service.deleteById(id);
        return "redirect:/available_books";
    }
}
