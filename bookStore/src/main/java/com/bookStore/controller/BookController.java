package com.bookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    // make it gated based
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/book_register")
    public String bookRegister()
    {
        return "bookRegister";
    }

    @GetMapping("/available_books")
    public String getAllBook(){
        return "boolList"; // it will return/redirect to the particular HTML page
    }
}
