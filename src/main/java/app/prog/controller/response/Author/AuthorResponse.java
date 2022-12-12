package app.prog.controller.response.Author;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class AuthorResponse {
    private int id;
    private String name;
    private String particularity;
    private boolean hasParticularity;
}
