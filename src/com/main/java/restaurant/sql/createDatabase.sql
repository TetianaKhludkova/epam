CREATE TABLE IF NOT EXISTS `menu` (
  `id` int(3) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `name` varchar(20),
  `price` double
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO `menu` (`id`, `name`, `price`) VALUES (1,'Pizza',10);
INSERT INTO `menu` (`id`, `name`, `price`) VALUES (2,'Sushi',20.5);
INSERT INTO `menu` (`id`, `name`, `price`) VALUES (3,'Cola',3.4);
INSERT INTO `menu` (`id`, `name`, `price`) VALUES (4,'Potato',7.2);


CREATE TABLE IF NOT EXISTS `customers` (
  `id` int(3) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `customerName` VARCHAR(10)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO `customers` (`id`, `customerName`) VALUES (1,'Juan');
INSERT INTO `customers` (`id`, `customerName`) VALUES (2,'Ann');
INSERT INTO `customers` (`id`, `customerName`) VALUES (3,'Moe');


CREATE TABLE IF NOT EXISTS `orders` (
  `id` int(3) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `price` int(5),
  `customerID` int(3),
  `prodactID` int(3) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO `orders` (`id`, `customerID`, `prodactID`) VALUES (1,'1','3');
INSERT INTO `orders` (`id`, `customerID`, `prodactID`) VALUES (2,'1','1');
INSERT INTO `orders` (`id`, `customerID`, `prodactID`) VALUES (3,'1','3');
INSERT INTO `orders` (`id`, `customerID`, `prodactID`) VALUES (4,'2','2');
INSERT INTO `orders` (`id`, `customerID`, `prodactID`) VALUES (5,'3','4');
INSERT INTO `orders` (`id`, `customerID`, `prodactID`) VALUES (6,'3','3');

