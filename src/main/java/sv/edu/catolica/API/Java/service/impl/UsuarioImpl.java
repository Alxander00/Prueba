package sv.edu.catolica.API.Java.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.API.Java.entities.UsuarioEntity;
import sv.edu.catolica.API.Java.repository.UsuarioRepository;
import sv.edu.catolica.API.Java.service.IUsuario;

import java.util.List;

@Service
public class UsuarioImpl implements IUsuario {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<UsuarioEntity> findAll(){
        return usuarioRepository.findAll();
    }

    @Override
    public UsuarioEntity save(UsuarioEntity usuario){
        return usuarioRepository.save(usuario);
    }
}
