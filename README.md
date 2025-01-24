# 🏥 Veterinary Clinic API | API de Clínica Veterinaria

[English](#english) | [Español](#español)

# English

## Overview
A comprehensive REST API built with Spring Boot 3.4.1 and Java 21, designed to manage all aspects of a veterinary clinic's operations. This system provides a robust platform for managing pets, consultations, clinical records, and staff.

## 🌟 Key Features
- Complete veterinary clinic management system
- JWT-based secure authentication
- In-memory H2 database with sample data
- Docker containerization
- Render deployment ready
- Comprehensive error handling
- Data validation
- Modular architecture

## 🏗 Project Structure
```
nfuegopy-api-veterinaria/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/veterinaria/
│   │   │       ├── modules/       # Core functionality
│   │   │       ├── ref/          # Reference data
│   │   │       └── seguridad/    # Security components
│   │   └── resources/
│   └── test/
├── Dockerfile
└── pom.xml
```

### 📦 Core Modules
1. **Consultation Management (Consulta)**
   - Schedule appointments
   - Record visit details
   - Track medical history
   - Manage diagnoses

2. **Employee Management (Empleado)**
   - Staff profiles
   - Contact information
   - Employment records
   - Schedule management

3. **Clinical Records (Ficha Clinica)**
   - Detailed medical histories
   - Treatment records
   - Follow-up appointments
   - Health metrics tracking

4. **Veterinarian Management (Veterinario)**
   - Professional profiles
   - Specializations
   - Availability scheduling
   - Patient assignments

### 📚 Reference Modules
1. **Pet Owners (Dueno)**
   - Complete owner profiles
   - Contact information
   - Multiple pet linking
   - Communication preferences

2. **Species Catalog (Especie)**
   - Animal species registry
   - Breed information
   - Species-specific care guidelines

3. **Pets Registry (Mascotas)**
   - Detailed pet profiles
   - Medical history
   - Owner associations
   - Age and health tracking

4. **Treatment Management (Tratamiento)**
   - Treatment protocols
   - Medication tracking
   - Cost management
   - Follow-up scheduling

## 🛠️ Technical Specifications

### Technologies Used
- **Java 21**: Latest LTS version
- **Spring Boot 3.4.1**: Modern application framework
- **Spring Security**: Authentication and authorization
- **Spring Data JPA**: Data persistence
- **H2 Database**: In-memory database
- **JWT**: Token-based security
- **Maven**: Dependency management
- **Docker**: Containerization
- **Lombok**: Boilerplate reduction

## 🚀 Installation and Setup

### Prerequisites
```bash
Java 21
Maven 3.9.x
Docker (optional)
Git
```

### Local Development Setup
1. Clone the repository:
```bash
git clone https://github.com/nfuegopy/nfuegopy-api-veterinaria.git
cd nfuegopy-api-veterinaria
```

2. Build the project:
```bash
mvn clean install
```

3. Run the application:
```bash
mvn spring-boot:run
```

### Docker Deployment
1. Build Docker image:
```bash
docker build -t veterinaria-api .
```

2. Run container:
```bash
docker run -p 8080:8080 veterinaria-api
```

## 📡 API Endpoints

### Authentication
```
POST /api/auth/login
Body: {
    "username": "string",
    "password": "string"
}
```

### Main Resources
- **Consultations**
  - GET /api/consultas
  - POST /api/consultas
  - GET /api/consultas/{id}
  - PUT /api/consultas/{id}
  - DELETE /api/consultas/{id}

- **Employees**
  - GET /api/empleados
  - POST /api/empleados
  - GET /api/empleados/{id}
  - PUT /api/empleados/{id}
  - DELETE /api/empleados/{id}

[Additional endpoints documentation...]

## 💾 Database Configuration

### H2 Database Settings
```properties
URL: jdbc:h2:mem:testdb
Username: sa
Password: 123
Console: http://localhost:8080/h2-console
```

## 🌐 Render Deployment Guide

1. **Repository Preparation**
   - Fork the repository
   - Configure environment variables

2. **Render Setup**
   - Create new Web Service
   - Connect GitHub repository
   - Select Docker runtime
   - Configure environment variables

3. **Deployment**
   - Use auto-deploy feature
   - Monitor build logs
   - Verify deployment

---

# Español

## Descripción General
Una API REST completa construida con Spring Boot 3.4.1 y Java 21, diseñada para gestionar todos los aspectos de las operaciones de una clínica veterinaria. Este sistema proporciona una plataforma robusta para la gestión de mascotas, consultas, registros clínicos y personal.

## 🌟 Características Principales
- Sistema completo de gestión de clínica veterinaria
- Autenticación segura basada en JWT
- Base de datos H2 en memoria con datos de ejemplo
- Contenedorización con Docker
- Listo para despliegue en Render
- Manejo integral de errores
- Validación de datos
- Arquitectura modular

## 🏗 Estructura del Proyecto
```
nfuegopy-api-veterinaria/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/veterinaria/
│   │   │       ├── modules/       # Funcionalidad principal
│   │   │       ├── ref/          # Datos de referencia
│   │   │       └── seguridad/    # Componentes de seguridad
│   │   └── resources/
│   └── test/
├── Dockerfile
└── pom.xml
```

### 📦 Módulos Principales
1. **Gestión de Consultas (Consulta)**
   - Programación de citas
   - Registro de visitas
   - Seguimiento de historial médico
   - Gestión de diagnósticos

2. **Gestión de Empleados (Empleado)**
   - Perfiles del personal
   - Información de contacto
   - Registros laborales
   - Gestión de horarios

3. **Registros Clínicos (Ficha Clinica)**
   - Historiales médicos detallados
   - Registros de tratamientos
   - Citas de seguimiento
   - Seguimiento de métricas de salud

4. **Gestión de Veterinarios (Veterinario)**
   - Perfiles profesionales
   - Especializaciones
   - Programación de disponibilidad
   - Asignación de pacientes

### 📚 Módulos de Referencia
1. **Dueños de Mascotas (Dueno)**
   - Perfiles completos de propietarios
   - Información de contacto
   - Vinculación de múltiples mascotas
   - Preferencias de comunicación

2. **Catálogo de Especies (Especie)**
   - Registro de especies animales
   - Información de razas
   - Pautas de cuidado específicas por especie

3. **Registro de Mascotas (Mascotas)**
   - Perfiles detallados de mascotas
   - Historial médico
   - Asociaciones con propietarios
   - Seguimiento de edad y salud

4. **Gestión de Tratamientos (Tratamiento)**
   - Protocolos de tratamiento
   - Seguimiento de medicación
   - Gestión de costos
   - Programación de seguimiento

## 🛠️ Especificaciones Técnicas

### Tecnologías Utilizadas
- **Java 21**: Última versión LTS
- **Spring Boot 3.4.1**: Framework de aplicación moderno
- **Spring Security**: Autenticación y autorización
- **Spring Data JPA**: Persistencia de datos
- **Base de datos H2**: Base de datos en memoria
- **JWT**: Seguridad basada en tokens
- **Maven**: Gestión de dependencias
- **Docker**: Contenedorización
- **Lombok**: Reducción de código repetitivo

## 🚀 Instalación y Configuración

### Prerequisitos
```bash
Java 21
Maven 3.9.x
Docker (opcional)
Git
```

### Configuración de Desarrollo Local
1. Clonar el repositorio:
```bash
git clone https://github.com/nfuegopy/nfuegopy-api-veterinaria.git
cd nfuegopy-api-veterinaria
```

2. Construir el proyecto:
```bash
mvn clean install
```

3. Ejecutar la aplicación:
```bash
mvn spring-boot:run
```

### Despliegue con Docker
1. Construir imagen Docker:
```bash
docker build -t veterinaria-api .
```

2. Ejecutar contenedor:
```bash
docker run -p 8080:8080 veterinaria-api
```

## 📡 Endpoints de la API

### Autenticación
```
POST /api/auth/login
Cuerpo: {
    "username": "string",
    "password": "string"
}
```

### Recursos Principales
- **Consultas**
  - GET /api/consultas
  - POST /api/consultas
  - GET /api/consultas/{id}
  - PUT /api/consultas/{id}
  - DELETE /api/consultas/{id}

- **Empleados**
  - GET /api/empleados
  - POST /api/empleados
  - GET /api/empleados/{id}
  - PUT /api/empleados/{id}
  - DELETE /api/empleados/{id}

[Documentación de endpoints adicionales...]

## 💾 Configuración de Base de Datos

### Configuración de H2
```properties
URL: jdbc:h2:mem:testdb
Usuario: sa
Contraseña: 123
Consola: http://localhost:8080/h2-console
```

## 🌐 Guía de Despliegue en Render

1. **Preparación del Repositorio**
   - Hacer fork del repositorio
   - Configurar variables de entorno

2. **Configuración en Render**
   - Crear nuevo Web Service
   - Conectar repositorio de GitHub
   - Seleccionar runtime Docker
   - Configurar variables de entorno

3. **Despliegue**
   - Usar función de auto-despliegue
   - Monitorear logs de construcción
   - Verificar despliegue

## 👨‍💻 Autor

**Antonio Barrios**
- GitHub: [@nfuegopy](https://github.com/nfuegopy)
- Contribuciones y sugerencias son bienvenidas

## 📄 Licencia

Este proyecto está licenciado bajo la Licencia MIT.

## 🔄 Actualizaciones y Mantenimiento | Updates and Maintenance

### Español
Este proyecto se mantiene activamente y recibe actualizaciones regulares. Las últimas actualizaciones incluyen:
- Actualización a Spring Boot 3.4.1
- Mejoras en características de seguridad
- Optimización de Docker
- Soporte para despliegue en Render

### English
This project is actively maintained and receives regular updates. Latest updates include:
- Upgrade to Spring Boot 3.4.1
- Enhanced security features
- Docker optimization
- Render deployment support

