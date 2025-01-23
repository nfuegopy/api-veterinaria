# Proyecto Veterinaria

Este proyecto es una API REST desarrollada con **Spring Boot** (versión 3.x), utilizando Java 21 y **Maven** como sistema de construcción.  
Permite gestionar **Dueños** y **Mascotas**, con una **base de datos en memoria H2** y un esquema inicial de tablas con datos de prueba.

A continuación se detallan los componentes, su organización y los pasos para compilar y ejecutar la aplicación.

---

## Tabla de Contenidos
1. [Arquitectura y Paquetes](#arquitectura-y-paquetes)
2. [Requisitos Previos](#requisitos-previos)
3. [Instalación y Configuración](#instalación-y-configuración)
4. [Estructura de Carpetas](#estructura-de-carpetas)
5. [Dependencias Principales en el POM](#dependencias-principales-en-el-pom)
6. [Autor](#autor)

---

## Arquitectura y Paquetes

El proyecto sigue una estructura típica de **Spring Boot** con:
- **Model** (entidades JPA)
- **Repository** (interfaces que extienden de `JpaRepository`)
- **Service** (clases con lógica de negocio)
- **Controller** (exposición de API REST con endpoints)
- **`data.sql`** para insertar datos iniciales en la BD

Se utiliza la **base de datos H2 en memoria** para desarrollo, y validaciones con **Jakarta Validation** (`@Valid`, `@NotBlank`, etc.).

---

## Requisitos Previos

- **Java 21** instalado.
- **Maven 3.8+** instalado.
- (Opcional) Un IDE como IntelliJ, Eclipse o VS Code con soporte para proyectos Maven/Spring Boot.

---

## Instalación y Configuración

1. **Clonar o descargar** este repositorio.
2. En la raíz del proyecto (donde está el `pom.xml`), ejecutar:
   ```bash
   mvn clean install


3. Para iniciar la aplicación localmente:
   ```bash
   mvn spring-boot:run

    o bien:
    ```bash
    mvn clean package
    java -jar target/veterinaria-0.0.1-SNAPSHOT.jar
   
4. Estructura de carpetas
   
 ```bash
    src
└── main
    ├── java
    │   └── com
    │       └── veterinaria
    │           └── veterinaria
    │               ├── VeterinariaApplication.java  
    │               ├── ref
    │               │   ├── dueno
    │               │   │   ├── model
    │               │   │   │   └── Dueno.java
    │               │   │   ├── repository
    │               │   │   │   └── DuenoRepository.java
    │               │   │   ├── service
    │               │   │   │   └── DuenoService.java
    │               │   │   └── controller
    │               │   │       └── DuenoController.java
    │               │   └── especie
    │               │       └── ...
    │               ├── model
    │               │   └── Mascota.java
    │               ├── repository
    │               │   └── MascotaRepository.java
    │               ├── service
    │               │   └── MascotaService.java
    │               └── controller
    │                   └── MascotaController.java
    └── resources
        ├── application.properties
        └── data.sql

```

5. Dependencias Principales en el POM

    ```bash
     <dependencies>
    <!-- Web: para exponer la API REST -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- JPA: para mapear entidades y acceder a BD -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- H2: BD en memoria para desarrollo/pruebas -->
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Validation: para @NotBlank, @Email, @Valid, etc. -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>

    <!-- Lombok: para reducir boilerplate de getters/setters -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <scope>provided</scope>
    </dependency>

    <!-- Test: JUnit (opcional) -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>

6. Author

**Nombre:** Antonio Cesar Barrios  

