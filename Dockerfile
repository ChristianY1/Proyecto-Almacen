# Usar la imagen oficial de MySQL
FROM mysql:8.0

# Configurar variables de entorno para la base de datos
ENV MYSQL_ROOT_PASSWORD=root_password
ENV MYSQL_DATABASE=mi_base_de_datos
ENV MYSQL_USER=mi_usuario
ENV MYSQL_PASSWORD=pass

# Copiar el script de inicialización a la imagen
COPY init.sql /docker-entrypoint-initdb.d/
