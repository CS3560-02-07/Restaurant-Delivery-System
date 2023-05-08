DROP DATABASE IF EXISTS delivery_system;
CREATE DATABASE delivery_system;

USE delivery_system;

-- Defining each table and its attributes
CREATE TABLE customer(
	customerID INT NOT NULL AUTO_INCREMENT,
    f_name VARCHAR(50),
    l_name VARCHAR(50),
    address VARCHAR(150),
    credit_card VARCHAR(4),
    phone_number VARCHAR(10),
    PRIMARY KEY(customerID)
);

CREATE TABLE restaurant(
	restaurantID INT AUTO_INCREMENT,
    restaurant_name VARCHAR(50),
    restaurant_address VARCHAR(150),
    restaurant_phone VARCHAR(10),
    username VARCHAR(20),
    pass VARCHAR(20),
    PRIMARY KEY(restaurantID)
);

CREATE TABLE orders(
	order_num INT AUTO_INCREMENT,
    customerID INT,
    restaurantID INT,
    total_cost DECIMAL(9,2),
    confirmed BOOLEAN, 
    FOREIGN KEY(customerID) REFERENCES customer(customerID),
    FOREIGN KEY(restaurantID) REFERENCES restaurant(restaurantID),
    PRIMARY KEY(order_num, customerID, restaurantID)
);

CREATE TABLE driver(
	driverID INT AUTO_INCREMENT,
	driver_name VARCHAR(50),
    car_info VARCHAR(150),
    license_num VARCHAR(8),
    username VARCHAR(20),
    pass VARCHAR(20),
    PRIMARY KEY(driverID)
);

CREATE TABLE pickup_confirmation(
	confirm_num INT AUTO_INCREMENT,
	confirmed BOOLEAN,
    restaurantID INT,
    driverID INT,
    FOREIGN KEY(restaurantID) REFERENCES restaurant(restaurantID),
    FOREIGN KEY(driverID) REFERENCES driver(driverID),
    PRIMARY KEY(confirm_num, restaurantID, driverID)
);

CREATE TABLE delivery(
	driverID INT,
    delivery_num INT AUTO_INCREMENT,
    estimated_time INT, 
    actual_time INT,
	distance INT(4),
    FOREIGN KEY(driverID) REFERENCES driver(driverID),
    PRIMARY KEY(delivery_num)
);

CREATE TABLE refund(
	delivery_num INT,
    total_refund DECIMAL(9,2),
    FOREIGN KEY(delivery_num) REFERENCES delivery(delivery_num),
    PRIMARY KEY(delivery_num)
);

/*
CREATE TABLE driver_payment(
	pay_id INT AUTO_INCREMENT,
	pay_rate DECIMAL(9,2),
    total_payment DECIMAL(9,2),
    delivery_num INT,
    FOREIGN KEY(delivery_num) REFERENCES delivery(delivery_num),
    PRIMARY KEY(pay_id, delivery_num)
    -- PRIMARY KEY(pay_id)
);
*/
