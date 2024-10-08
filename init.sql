-- Script para crear la base de datos y las tablas

-- Crear base de datos
CREATE DATABASE IF NOT EXISTS mi_base_de_datos;

-- Usar la base de datos
USE mi_base_de_datos;

-- Creación de la tabla Usuario
CREATE TABLE IF NOT EXISTS Usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(100) UNIQUE NOT NULL,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Creación de la tabla Producto
CREATE TABLE IF NOT EXISTS Producto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10, 2) NOT NULL,
    usuario_id INT,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_usuario_producto FOREIGN KEY (usuario_id) REFERENCES Usuario(id) ON DELETE CASCADE
);

-- Insertar algunos usuarios
INSERT INTO Usuario (nombre, correo) VALUES ('Juan Pérez', 'juan.perez@example.com');
INSERT INTO Usuario (nombre, correo) VALUES ('María Gómez', 'maria.gomez@example.com');

-- Insertar algunos productos relacionados con los usuarios
INSERT INTO Producto (nombre, descripcion, precio, usuario_id) 
VALUES ('Laptop', 'Laptop Dell XPS 13', 1200.00, 1);

INSERT INTO Producto (nombre, descripcion, precio, usuario_id) 
VALUES ('Smartphone', 'iPhone 13 Pro Max', 999.99, 1);

INSERT INTO Producto (nombre, descripcion, precio, usuario_id) 
VALUES ('Tablet', 'iPad Pro', 799.99, 2);
