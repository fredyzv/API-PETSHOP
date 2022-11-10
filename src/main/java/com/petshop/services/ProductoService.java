package com.petshop.services;

import com.petshop.model.Producto;
import com.petshop.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository repop;

    public Producto obtenerProducto(Integer codproducto){
        return repop.findById(codproducto).get();
    }

}
