package sv.edu.catolica.API.Java.service;

import sv.edu.catolica.API.Java.entities.ProductoEntity;
import sv.edu.catolica.API.Java.entities.UsuarioEntity;

import java.util.List;

public interface IUsuario {
    List<UsuarioEntity> findAll();

    UsuarioEntity save(UsuarioEntity usuario);
}
