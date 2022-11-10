package com.petshop.controller;

import com.petshop.model.Producto;
import com.petshop.repository.ProductoRepository;
import com.petshop.services.ProductoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoApiController {

    @Autowired
    ProductoRepository repop;

    @Autowired
    ProductoService servp;

    @GetMapping("/api/producto")
    List<Producto> listaProducto(){
        List<Producto> productos = repop.findAll();
        return productos;
    }

    @GetMapping("/api/producto/{codproducto}")
    public ResponseEntity<Producto> buscar(@PathVariable Integer codproducto){
        return new ResponseEntity<>(servp.obtenerProducto(codproducto), HttpStatus.OK);
    }
}
