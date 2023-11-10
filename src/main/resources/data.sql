DROP table IF EXISTS empleados;
DROP table IF EXISTS departamentos;

CREATE TABLE Departamentos (
    codigo INT PRIMARY KEY,
    nombre VARCHAR(100),
    presupuesto INT
);

CREATE TABLE Empleados (
    dni VARCHAR(8) PRIMARY KEY,
    nombre VARCHAR(100),
    apellidos VARCHAR(100),
    departamento INT,
    FOREIGN KEY (departamento)
        REFERENCES Departamentos (codigo)
        ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Departamentos (codigo, nombre, presupuesto) VALUES (1, 'Departamento', 50000);
INSERT INTO Departamentos (codigo, nombre, presupuesto) VALUES (2, 'Departamento', 75000);
INSERT INTO Empleados (DNI, nombre, apellidos, departamento) VALUES ('12345678', 'Juan', 'Perez', 1);
INSERT INTO Empleados (DNI, nombre, apellidos, departamento) VALUES ('98765432', 'Maria', 'Gonzalez', 2);