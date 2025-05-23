CREATE TABLE IF NOT EXISTS banks (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    address VARCHAR(50) NOT NULL,
    nit VARCHAR(50) NOT NULL
);

INSERT INTO banks(name, address, nit) VALUES ('Bancolombia', 'Calle 16', '1234');
INSERT INTO banks(name, address, nit) VALUES ('Banco de Bogota', 'Calle 17', '1235');
INSERT INTO banks(name, address, nit) VALUES ('Banco Caja Social', 'Calle 18', '1236');