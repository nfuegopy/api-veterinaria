-- insertando valores dentro de tablas
INSERT INTO ESPECIE (nombre) VALUES ('Perro');
INSERT INTO ESPECIE (nombre) VALUES ('Gato');
INSERT INTO ESPECIE (nombre) VALUES ('Hámster');

INSERT INTO DUENO (id, nombre, email, telefono, telefono_alternativo, direccion)
VALUES
(1, 'Juan Perez', 'juan@example.com', '1111-1111', NULL, 'Calle A 123'),
(2, 'Maria Gomez', 'maria@example.com', '2222-2222', '9999-9999', 'Calle B 456');

INSERT INTO MASCOTA (id, nombre, edad, dueno_id, especie_id)
VALUES (1, 'Firulais', 3, 1, 1),
       (2, 'Michi', 1, 2, 2);



INSERT INTO CONSULTA (id, fecha, motivo, diagnostico, tratamiento, observaciones, mascota_id)
VALUES (1, '2025-02-15', 'Vacunación', 'Todo OK', 'Vacuna antirrábica', 'Se aplicó vacuna', 1),
       (2, '2025-02-20', 'Dolor de estómago', 'Gastritis leve', 'Medicamento X', 'Revisar en 3 días', 2);

