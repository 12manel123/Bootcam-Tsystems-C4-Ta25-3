DROP table IF EXISTS almacenes;
DROP table IF EXISTS cajas;

CREATE TABLE almacenes (
    codigo INT PRIMARY KEY,
    lugar VARCHAR(100) NOT NULL,
    capacidad INT NOT NULL
);

CREATE TABLE cajas (
    num_referencia CHAR(5) NOT NULL PRIMARY KEY,
    contenido VARCHAR(100) NOT NULL,
    valor INT NOT NULL,
    almacen INT NOT NULL,
    FOREIGN KEY (almacen) REFERENCES Almacenes(codigo)
);

INSERT INTO almacenes (codigo, lugar, capacidad) VALUES (1, 'Almacén A', 1000);
INSERT INTO almacenes (codigo, lugar, capacidad) VALUES (2, 'Almacén B', 800);
INSERT INTO almacenes (codigo, lugar, capacidad) VALUES (3, 'Almacén C', 1200);
INSERT INTO almacenes (codigo, lugar, capacidad) VALUES (4, 'Almacén D', 1500);

INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('C001', 'Herramientas', 500, 1);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('C002', 'Electrónica', 700, 2);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('C003', 'Ropa', 300, 1);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('C004', 'Juguetes', 400, 3);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('C005', 'Alimentos', 600, 4);
