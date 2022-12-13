package app.prog.controller.mapper;

import app.prog.controller.response.Author.CreateAuthorResponse;
import app.prog.controller.response.Book.BookResponse;
import app.prog.controller.response.Book.CreateBookResponse;
import app.prog.controller.response.Book.UpdateBookResponse;
import app.prog.model.AuthorEntity;
import app.prog.model.BookEntity;
import app.prog.repository.AuthorRepository;
import org.springframework.stereotype.Component;

@Component
public class BookRestMapper {
    private final AuthorRepository authorRepository;

    public BookRestMapper(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public BookResponse toRest(BookEntity domain) {
        AuthorEntity author = domain.getAuthor();
        String authorName = author !=null ? (author).getName() : null;
        return BookResponse.builder()
                .id(domain.getId())
                .title(domain.getTitle())
                .author(authorName)
                .hasAuthor(domain.hasAuthor())
                .build();
    }

    public BookEntity toDomain(CreateBookResponse rest) {

        return BookEntity.builder()
                .author(AuthorEntity.builder().name(String.valueOf(rest.getAuthor())).build())
                .title(rest.getTitle())
                .pageNumber(0) //Constraint not null in database, default value is 0
                .build();
    }

    public BookEntity toDomain(UpdateBookResponse rest) {
        return BookEntity.builder()
                .id(rest.getId())
                .author(AuthorEntity.builder().name(rest.getAuthor()).build())
                .title(rest.getTitle())
                .pageNumber(0) //Constraint not null in database, default value is 0
                .build();
    }
}
