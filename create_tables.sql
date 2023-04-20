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

CREATE TABLE restaurant(
	restaurantID INT AUTO_INCREMENT,
    restaurant_name VARCHAR(50),
    restaurant_address VARCHAR(150),
    restaurant_phone VARCHAR(10),
    PRIMARY KEY(restaurantID)
);

CREATE TABLE orders(
	order_num INT,
    customerID INT,
    restaurantID INT,
    total_cost DECIMAL(9,2),
    FOREIGN KEY(customerID) REFERENCES customer(customerID),
    FOREIGN KEY(restaurantID) REFERENCES restaurant(restaurantID),
    PRIMARY KEY(order_num, customerID, restaurantID)
);

CREATE TABLE pickup_confirmation(
	confirm_num INT AUTO_INCREMENT,
	confirmed BOOLEAN,
    restaurantID INT,
    driverID INT,
    PRIMARY KEY(confirm_num, restaurantID, driverID)
);

CREATE TABLE driver(
	driverID INT AUTO_INCREMENT,
	driver_name VARCHAR(50),
    car_info VARCHAR(150),
    license_num VARCHAR(8),
    PRIMARY KEY(driverID)
);

CREATE TABLE delivery(
	driverID INT,
    delivery_num INT AUTO_INCREMENT,
    estimated_time TIME, 
    time_stamp TIME,
	distance INT(4),
    PRIMARY KEY(delivery_num),
    FOREIGN KEY(driverID) REFERENCES driver(driverID)
);
