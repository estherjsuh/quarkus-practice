package org.esther;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class BookRepository {

    public List<Book> getAllBooks() {
        return List.of(
                new Book(1,"Understanding Quarkus","Some Dude", 2020, "IT"),
                new Book(2, "Practicing Quarkus", "Some Dude", 2020, "IT"),
                new Book(3, "Effective Java", "Some Dudette", 2021, "IT"),
                new Book(4, "Thinking In Java", "Brucey", 1998, "IT")
        );
    }

    public int countAllBooks(){
        return getAllBooks().size();
    }

    public Optional<Book> getBook(int id){
        return getAllBooks().stream().filter(book -> book.id == id).findFirst();

    }
}