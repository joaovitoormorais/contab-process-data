package contab.process_data.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //indica que a classe será mapeada por uma tabela no DB relacional
@Table(name = "artists")
@Getter //Já contém os getters & setters com essas 2 anotações pois to usando o Lombok
@Setter
@NoArgsConstructor //Essas outras anotações vão gerar constuctors automatica...
@AllArgsConstructor
public class ArtistsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastName;
}
