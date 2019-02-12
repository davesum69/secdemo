package com.example.secdemo.controllers;

import com.example.secdemo.models.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        List<Book> bookList = new ArrayList<Book>();
        Book b = new Book();
        //System.out.println(Book.getBook().hashCode());
        b.setBookISBN("A090");
        b.setBookTitle("Cliffhanger");
        b.setBookPrice(20.50);
        bookList.add(b);
        b = new Book();
        b.setBookISBN("ASD67");
        b.setBookTitle("Jim Reeves");
        b.setBookPrice(14.50);
        bookList.add(b);
        //System.out.println(Book.getBook().hashCode());
        b = new Book();
        b.setBookISBN("GYG676786789");
        b.setBookTitle("God Father");
        b.setBookPrice(32.00);
        bookList.add(b);

        b = new Book();
        b.setBookISBN("BHT8945");
        b.setBookTitle("Brief History");
        b.setBookPrice(12.00);
        bookList.add(b);

        Integer []as=new Integer[]{2};

        double d1 = bookList.stream()
                .mapToDouble(m -> m.getBookPrice() * as[0])
                .sum();

        as[0]=0;
        System.out.println(d1);


        return bookList;
    }
}
