package sv.edu.catolica.API.Java.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.API.Java.entities.ProductoEntity;
import sv.edu.catolica.API.Java.repository.ProductoRepository;
import sv.edu.catolica.API.Java.service.IProducto;

import java.util.List;

@Service
public class ProductoImpl implements IProducto {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<ProductoEntity> findAll(){
        return productoRepository.findAll();
    }

    @Override
    public ProductoEntity save(ProductoEntity producto) {
        return productoRepository.save(producto);
    }
}
