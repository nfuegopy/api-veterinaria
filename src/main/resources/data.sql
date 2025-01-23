-- data.sql
INSERT INTO ESPECIE (nombre) VALUES ('Perro');
INSERT INTO ESPECIE (nombre) VALUES ('Gato');
INSERT INTO ESPECIE (nombre) VALUES ('Hámster');

-- Insertamos algunos dueños
INSERT INTO DUENO (id, nombre, email, telefono, telefono_alternativo, direccion)
VALUES
(1, 'Juan Perez', 'juan@example.com', '1111-1111', NULL, 'Calle A 123'),
(2, 'Maria Gomez', 'maria@example.com', '2222-2222', '9999-9999', 'Calle B 456');
