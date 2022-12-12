package app.prog.controller.response.Author;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class CreateAuthorResponse {
    private String name;
    private String particularity;
}

