package app.prog.controller.response.Book;

import app.prog.controller.response.Author.CreateAuthorResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class CreateBookResponse {
    private CreateAuthorResponse author;
    private String title;
}
