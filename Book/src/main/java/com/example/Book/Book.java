package com.example.Book;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String description;
    @Column(name = "author_name")
    private String authorName;
    private LocalDate date;
    private double price;
    private String format;
    private String language;
    @Column(name = "isbn_number")
    private String isbnNumber;
    @Column(name = "print_length")
    private int printLength;
    private String publisher;
    private String image;

    public Book() {
    }

    public Book(Integer id, String title, String description, String authorName, LocalDate date, double price, String format, String language, String isbnNumber, int printLength, String publisher, String image) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.authorName = authorName;
        this.date = date;
        this.price = price;
        this.format = format;
        this.language = language;
        this.isbnNumber = isbnNumber;
        this.printLength = printLength;
        this.publisher = publisher;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public int getPrintLength() {
        return printLength;
    }

    public void setPrintLength(int printLength) {
        this.printLength = printLength;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}