CREATE TABLE IF NOT EXISTS menu
(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(20) DEFAULT NULL ,
    price DOUBLE DEFAULT NULL
);
CREATE UNIQUE INDEX menu_id_uindex ON menu (id);

INSERT INTO `menu` (`name`, `price`) VALUES ('Pizza',10);
INSERT INTO `menu` (`name`, `price`) VALUES ('Sushi',20.5);
INSERT INTO `menu` (`name`, `price`) VALUES ('Cola',3.4);
INSERT INTO `menu` (`name`, `price`) VALUES ('Potato',7.2);


CREATE TABLE customers
(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    customerName VARCHAR(10) NOT NULL
);
CREATE UNIQUE INDEX customers_id_uindex ON customers (id);

INSERT INTO `customers` (`id`, `customerName`) VALUES (1,'Juan');
INSERT INTO `customers` (`id`, `customerName`) VALUES (2,'Ann');
INSERT INTO `customers` (`id`, `customerName`) VALUES (3,'Moe');


CREATE TABLE orders
(
  id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  customerId INT NOT NULL,
  productId INT NOT NULL
);
CREATE UNIQUE INDEX orders_id_uindex ON orders (id);

INSERT INTO `orders` (`id`, `customerId`, `productId`) VALUES (1,'1','3');
INSERT INTO `orders` (`id`, `customerId`, `productId`) VALUES (2,'1','1');
INSERT INTO `orders` (`id`, `customerId`, `productId`) VALUES (3,'1','3');
INSERT INTO `orders` (`id`, `customerId`, `productId`) VALUES (4,'2','2');
INSERT INTO `orders` (`id`, `customerId`, `productId`) VALUES (5,'3','4');
INSERT INTO `orders` (`id`, `customerId`, `productId`) VALUES (6,'3','3');

