package com.example.proyectosTest.producto;

import java.security.PublicKey;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

     private static final Logger logger = LoggerFactory.getLogger(ProductoService.class);

    @Autowired
    ProductoRepository productoRepository;
    
    // Método para obtener todos los productos usando Native Query
    public List<ProductoDTO> obtenerTodosLosProductos() {
        return productoRepository.getAllProductosAsDTO();
    }

    public List<ProductoDTO> obtenerNombreDescripcion(){
        return productoRepository.getNombreDescripcion();
    }

    public List<ProductoDTO> obtenerDtos(){
        return productoRepository.getAllProductosAsDTO();
    }

    
}
