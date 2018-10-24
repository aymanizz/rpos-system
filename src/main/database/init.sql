CREATE DATABASE IF NOT EXISTS rposdb;

USE rposdb;

CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(40) NOT NULL,
    username VARCHAR(20) UNIQUE NOT NULL,
    role ENUM('ADMIN', 'CASHIER') NOT NULL,
    password CHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS items (
    id SERIAL PRIMARY KEY,
    barcode CHAR(12) NOT NULL,
    name VARCHAR(70) NOT NULL,
    price DOUBLE NOT NULL
);

-- CREATE TABLE IF NOT EXISTS bills (
--     id SERIAL PRIMARY KEY,
--     total INT NOT NULL,
--     issue_date DATE NOT NULL,
--     cashier_id INT NOT NULL,
--     CONSTRAINT bills_users_fk FOREIGN KEY (cashier_id) REFERENCES users(id)
-- );
-- 
-- CREATE TABLE IF NOT EXISTS carts (
--     item_id BIGINT UNSIGNED NOT NULL,
--     bill_id BIGINT UNSIGNED NOT NULL,
--     quantity INT NOT NULL DEFAULT 1,
--     CONSTRAINT carts_items_fk FOREIGN KEY (item_id) REFERENCES items(id),
--     CONSTRAINT carts_bill_fk  FOREIGN KEY (bill_id) REFERENCES bills(id)
-- );

INSERT INTO users(name, username, role, password) VALUES (
    'admin', 'admin', 'ADMIN',
    '$31$16$nN79DEAVZdCL1WDWxdeqfG1KrClMkcGm1f7LoqG7HQ0'
);

INSERT INTO items(barcode, name, price) VALUES (
    '012559548216', 'Tea', 15.5
);

INSERT INTO items(barcode, name, price) VALUES (
    '489616548954', 'Rice', 45
);

INSERT INTO items(barcode, name, price) VALUES (
    '189532189785', 'Soap', 12.5
);

INSERT INTO items(barcode, name, price) VALUES (
    '156468942365', 'Coffee', 15.5
);

INSERT INTO items(barcode, name, price) VALUES (
    '789234156464', 'Egyptian Rice', 45
);

INSERT INTO items(barcode, name, price) VALUES (
    '456841689478', 'Lifeboy Soap', 12.5
);

INSERT INTO items(barcode, name, price) VALUES (
    '975467984562', 'Dove Soap', 15.5
);

INSERT INTO items(barcode, name, price) VALUES (
    '198756415241', 'Apple', 45
);

INSERT INTO items(barcode, name, price) VALUES (
    '478945646548', 'Yoghurt', 12.5
);

INSERT INTO items(barcode, name, price) VALUES (
    '489456489674', 'Milk', 15.5
);

INSERT INTO items(barcode, name, price) VALUES (
    '456815869864', 'Big Ketchup Bottle', 45
);

INSERT INTO items(barcode, name, price) VALUES (
    '987564165645', 'Mayo', 12.5
);

INSERT INTO items(barcode, name, price) VALUES (
    '123548979566', 'Chocolate', 15.5
);

INSERT INTO items(barcode, name, price) VALUES (
    '654818676984', 'Large Pepsi', 35
);

INSERT INTO items(barcode, name, price) VALUES (
    '756498416598', 'Small Pepsi', 12
);

GRANT ALL PRIVILEGES ON rposdb.* TO 'javadbc'@'localhost' IDENTIFIED BY '0000';
