package com.example.proyectosTest.producto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * ProductoRepository
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

  @Query(value = "SELECT * FROM Producto", nativeQuery = true)
  List<Producto> findAllProductosNative();

  // Usamos JPQL para mapear los resultados directamente al DTO
  @Query("SELECT new com.example.proyectosTest.producto.ProductoDTO(p.nombre, p.descripcion) FROM Producto p")
  List<ProductoDTO> getNombreDescripcion();

  @Query("SELECT new com.example.proyectosTest.producto.ProductoDTO(p.id, p.nombre, p.descripcion, p.precio, p.usuarioId, p.fechaCreacion) FROM Producto p")
  List<ProductoDTO> getAllProductosAsDTO();

}
