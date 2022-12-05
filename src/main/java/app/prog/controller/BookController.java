package app.prog.controller;

import app.prog.model.Book;
import app.prog.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class BookController {
    private final BookService service;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return service.getBooks();
    }
}
