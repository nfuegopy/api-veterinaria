# Usa una imagen base con Maven y JDK
FROM maven:3.8.5-eclipse-temurin-21 AS build

# Establece el directorio de trabajo
WORKDIR /app

# Copia el código fuente al contenedor
COPY . .

# Ejecuta Maven para empaquetar la aplicación
RUN mvn clean package -DskipTests

# Usa una imagen ligera de Java para la ejecución
FROM eclipse-temurin:21-jdk-jammy

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR desde la etapa anterior
COPY --from=build /app/target/veterinaria-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto de la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]
