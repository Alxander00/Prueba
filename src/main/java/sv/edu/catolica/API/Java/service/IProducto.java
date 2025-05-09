package sv.edu.catolica.API.Java.service;

import sv.edu.catolica.API.Java.entities.ProductoEntity;

import java.util.List;

public interface IProducto {
    List<ProductoEntity> findAll();

    ProductoEntity save(ProductoEntity producto);
}
