package sv.edu.catolica.API.Java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.API.Java.entities.ProductoEntity;
import sv.edu.catolica.API.Java.entities.UsuarioEntity;
import sv.edu.catolica.API.Java.service.IUsuario;

import java.util.List;

@RestController
@RequestMapping("/process")
public class UsuarioController {
    @Autowired
    private IUsuario usuario;

    @Transactional(readOnly = true)
    @GetMapping("/Usuario")
    public List<UsuarioEntity> getUsuario() {
        return usuario.findAll();
    }

    @Transactional
    @PostMapping("/usuarios")
    public UsuarioEntity saveUsuario(@RequestBody UsuarioEntity nuevousuario) {
        return usuario.save(nuevousuario);
    }

}
