package com.example.proyectosTest.producto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    
    @Autowired
    ProductoService productoService;

    @Autowired 
    ProductoRepository productoRepository;

    @GetMapping
    public List<ProductoDTO> obtenerProductos() {
        return productoRepository.getAllProductosAsDTO();
        
    }

    @PostMapping("/nombres")
    public ResponseEntity<?> obtenerNombreDescripcion() {
        List<ProductoDTO> productos = productoService.obtenerNombreDescripcion();
        return ResponseEntity.ok(productos);
    }
    
}
