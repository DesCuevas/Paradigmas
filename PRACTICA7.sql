-- Creación de la base de datos "school"
CREATE DATABASE school;

-- Selección de la base de datos
USE school;

-- Creación de la tabla "students" con los campos de "boleta" y "nombre"
CREATE TABLE students (
  boleta INT PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL
);

-- Creación de la tabla "student_details" para almacenar el domicilio y correo electrónico
CREATE TABLE student_details (
  correo_electronico VARCHAR(50) PRIMARY KEY,
  domicilio VARCHAR(100),
  boleta INT,
  FOREIGN KEY (boleta) REFERENCES students(boleta)
);

-- Inserciones de prueba en la tabla "students"
INSERT INTO students (boleta, nombre) VALUES (123456789, 'Juan Pérez');
INSERT INTO students (boleta, nombre) VALUES (987654321, 'María Gómez');

-- Inserciones de prueba en la tabla "student_details"
INSERT INTO student_details (boleta, domicilio, correo_electronico) VALUES (123456789, 'Calle 123, Ciudad', 'juan@example.com');
INSERT INTO student_details (boleta, domicilio, correo_electronico) VALUES (987654321, 'Avenida 456, Pueblo', 'maria@example.com');

SELECT*FROM students;
SELECT*FROM student_details;




