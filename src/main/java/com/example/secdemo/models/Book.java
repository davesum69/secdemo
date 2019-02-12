package com.example.secdemo.models;

public class Book {
    private String bookISBN;
    private String bookTitle;
    private double bookPrice;

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public static Book getBook(){
        Book aBook = new Book();
        aBook.setBookISBN("ASIO");
        aBook.setBookTitle("Trovaldis");
        return new Book();
    }
}
