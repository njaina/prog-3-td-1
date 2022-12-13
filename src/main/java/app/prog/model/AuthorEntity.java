package app.prog.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "author")

public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String particularity;
    private Date birthdate;
    @OneToMany(mappedBy = "author")
    private List<BookEntity> books;
    public boolean hasParticularity(){return particularity != null;}
}
