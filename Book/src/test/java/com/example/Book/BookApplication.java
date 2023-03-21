package com.example.Book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class BookApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BookApplication.class, args);
        BookRepository repository = context.getBean(BookRepository.class);
        repository.save(new Book(1,"Harry Potter", "Book about wizards...","12 Nov. 2021", "J.K.Rawling",
                20.50, "HARDCOVER", "English", "111111BL", 20,"press"));
    }
}
