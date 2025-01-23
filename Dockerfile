# Utilizamos una imagen base de Java 21
FROM eclipse-temurin:21-jdk-jammy

# Establecemos un directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiamos el archivo JAR generado por Maven o Gradle al contenedor
COPY target/veterinaria-0.0.1-SNAPSHOT.jar app.jar

# Exponemos el puerto en el que corre nuestra aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
