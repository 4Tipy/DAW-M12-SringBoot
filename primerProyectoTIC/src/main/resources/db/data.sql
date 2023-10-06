CREATE TABLE IF NOT EXISTS libros(
    idint PRIMARY KEY AUTO_INCREMENT,
    titulo varchar(100) NOT NULL,
    autor varchar(100) NOT NULL,
    editorial varchar(50) NOT NULL,
    fecha date NOT NULL,
    tematica varchar(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS