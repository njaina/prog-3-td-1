package app.prog.service;

import app.prog.model.Book;
import app.prog.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {
    private final BookRepository repository;

    public List<Book> getBooks() {
        return repository.findAll();
    }
}
