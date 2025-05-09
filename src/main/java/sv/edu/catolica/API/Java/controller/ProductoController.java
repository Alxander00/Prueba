package sv.edu.catolica.API.Java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.API.Java.entities.ProductoEntity;
import sv.edu.catolica.API.Java.service.IProducto;

import java.util.List;

@RestController
@RequestMapping("/process")
public class ProductoController {
    @Autowired
    private IProducto iproducto;

    @Transactional(readOnly = true)
    @GetMapping("/libros")
    public List<ProductoEntity> getLibros() {
        return iproducto.findAll();
    }

    @Transactional
    @PostMapping("/libro")
    public ProductoEntity saveLibro(@RequestBody ProductoEntity nuevoproducto) {
        return iproducto.save(nuevoproducto);
    }

    @Transactional(readOnly = true)
    @GetMapping("/libros2")
    public List<ProductoEntity> getLibros2() {
        return iproducto.findAll();
    }
}
