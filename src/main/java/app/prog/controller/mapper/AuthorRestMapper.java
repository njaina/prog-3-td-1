package app.prog.controller.mapper;

import app.prog.controller.response.Author.AuthorResponse;
import app.prog.controller.response.Author.CreateAuthorResponse;
import app.prog.controller.response.Author.UpdateAuthorResponse;
import app.prog.model.AuthorEntity;
import app.prog.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AuthorRestMapper {
    private final AuthorRepository repository;
    public AuthorResponse toRest(AuthorEntity domain){
        return AuthorResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .particularity(domain.getParticularity())
                .hasParticularity(domain.hasParticularity())
                .build();
    }

    public AuthorEntity toDomain(CreateAuthorResponse rest){
        return AuthorEntity.builder()
                .name(rest.getName())
                .particularity(rest.getParticularity())
                .birthdate(null)
                .build();
    }

    public AuthorEntity toDomain(UpdateAuthorResponse rest){
        AuthorEntity author = repository.getById(rest.getId());
        return AuthorEntity.builder()
                .id(author.getId())
                .name(rest.getName())
                .particularity(rest.getParticularity())
                .build();
    }
}
