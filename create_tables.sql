DROP DATABASE IF EXISTS delivery_system;
CREATE DATABASE delivery_system;

USE delivery_system;

CREATE TABLE customer(
	customerID INT AUTO_INCREMENT,
    f_name VARCHAR(50),
    l_name VARCHAR(50),
    address VARCHAR(150),
    credit_card VARCHAR(4),
    phone_number VARCHAR(10),
    PRIMARY KEY(customerID)
);

CREATE TABLE orders(
	order_num INT AUTO_INCREMENT,
    customerID INT AUTO_INCREMENT,
    total_cost DECIMAL(9,2),
    FOREIGN KEY(customerID) REFERENCES customer(customerID),
    PRIMARY KEY(order_num, customerID)
);

CREATE TABLE restaurant(
	restaurantID INT AUTO_INCREMENT,
    restaurant_name
);

