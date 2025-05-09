package sv.edu.catolica.API.Java.entities;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Libros")

public class ProductoEntity {
    @Id
    @Column(columnDefinition = "INT", name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idLibro;

    @Column(columnDefinition = "VARCHAR(20)", unique = true)
    private String isbn;

    @Column(columnDefinition = "VARCHAR(100)")
    private String titulo;

    @Column(columnDefinition = "VARCHAR(50)")
    private String autor;
}
