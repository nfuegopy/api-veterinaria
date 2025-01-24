-- insertando valores dentro de tablas
INSERT INTO ESPECIE (nombre) VALUES ('Perro');
INSERT INTO ESPECIE (nombre) VALUES ('Gato');
INSERT INTO ESPECIE (nombre) VALUES ('Hámster');

INSERT INTO DUENO (id, nombre, email, telefono, telefono_alternativo, direccion)
VALUES
(1, 'Juan Perez', 'juan@example.com', '1111-1111', NULL, 'Calle A 123'),
(2, 'Maria Gomez', 'maria@example.com', '2222-2222', '9999-9999', 'Calle B 456');

INSERT INTO MASCOTA (id, nombre, edad, dueno_id, especie_id)
VALUES
(1, 'Firulais', 3, 1, 1),
(2, 'Michi', 1, 2, 2),
(3, 'Bolita', 2, 1, 3);

-- Insertando empleados
INSERT INTO EMPLEADO (id, nombre, apellido, documento, fecha_nac, direccion, estado_civil, email, telefono, telefono_secundario)
VALUES
(1, 'Carlos', 'Gómez', '12345678', '1990-05-15', 'Av. Siempre Viva 742', 'Casado', 'carlos.gomez@example.com', '555-1234', '555-5678'),
(2, 'María', 'López', '98765432', '1985-08-10', 'Calle Falsa 123', 'Soltera', 'maria.lopez@example.com', '555-8765', NULL),
(3, 'Luis', 'Martínez', '45678901', '1992-03-25', 'Calle Principal 456', 'Divorciado', 'luis.martinez@example.com', '555-6789', '555-4321');






