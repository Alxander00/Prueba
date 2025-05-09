package sv.edu.catolica.API.Java.entities;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Usuarios")

public class UsuarioEntity {
    @Id
    @Column(columnDefinition = "INT", name = "UsuarioID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long usuarioID;

    @Column(columnDefinition = "VARCHAR(100)")
    private String nombre;

    @Column(columnDefinition = "VARCHAR(100)")
    private String apellido;

    @Column(columnDefinition = "VARCHAR(100)", unique = true)
    private String email;

    @Column(columnDefinition = "VARCHAR(15)")
    private String telefono;

    @Column(columnDefinition = "VARCHAR(255)")
    private String direccion;
}
