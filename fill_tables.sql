USE delivery_system;

-- Inserting mock data into tables
INSERT INTO customer 
VALUES (NULL, 'Ally', 'Ly', '5200 Wheeler Ave, La Verne, CA 91750', '3444', '1231231231'),
	(NULL, 'Carlos', 'Rodriguez', '1225 N Grand Ave, Walnut, CA 91789', '1111', '1111111111');

INSERT INTO restaurant
VALUES (NULL, 'JJ Boba', '3560 WEST TEMPLE STE A Pomona, CA 91768', '9098968318', 'JJBoba', '1234');
    
INSERT INTO orders
VALUES (NULL, 1, 1, 19.99);

INSERT INTO driver
VALUES (NULL, 'Laurence Timothy Manalo Garcia', 'Honda Civic', '22222222', 'Laurence', '1234');
