package com.example.proyectosTest.producto;

import java.math.BigDecimal;
import java.sql.Timestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Producto", schema = "mi_base_de_datos")  // Nombre de la tabla y esquema especificados
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")  // Nombre de la columna 'id'
    private Long id;

    @Column(name = "nombre", length = 100)  // Nombre de la columna 'nombre' con longitud especificada
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "TEXT")  // Nombre de la columna 'descripcion' y tipo TEXT
    private String descripcion;

    @Column(name = "precio", precision = 10, scale = 2)  // Nombre de la columna 'precio' con precisión y escala
    private BigDecimal precio;

    @Column(name = "usuario_id")  // Nombre de la columna 'usuario_id'
    private Integer usuarioId;

    @Column(name = "fecha_creacion")  // Nombre de la columna 'fecha_creacion' de tipo TIMESTAMP
    private Timestamp fechaCreacion;

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
