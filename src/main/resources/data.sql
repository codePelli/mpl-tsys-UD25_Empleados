drop database if exists ud14_ejercicio04;
create database if not exists ud14_ejercicio04;
use ud14_ejercicio04;

CREATE TABLE IF NOT EXISTS Departamentos (
    codigo INT PRIMARY KEY,
    nombre NVARCHAR(100),
    presupuesto INT
);

CREATE TABLE IF NOT EXISTS Empleados (
    DNI VARCHAR(8) PRIMARY KEY,
    nombre NVARCHAR(100),
    apellidos NVARCHAR(255),
    departamento INT,
    FOREIGN KEY (departamento)
        REFERENCES Departamentos (codigo)
        ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Departamentos (codigo, nombre, presupuesto) VALUES (1, 'Departamento de Ventas', 50000);
INSERT INTO Departamentos (codigo, nombre, presupuesto) VALUES (2, 'Departamento de IT', 75000);
INSERT INTO Empleados (DNI, nombre, apellidos, departamento) VALUES ('12345678A', 'Juan', 'Perez', 1);
INSERT INTO Empleados (DNI, nombre, apellidos, departamento) VALUES ('98765432B', 'Maria', 'Gonzalez', 2);