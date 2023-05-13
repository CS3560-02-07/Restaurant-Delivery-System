USE delivery_system;

-- Inserting mock data into tables
INSERT INTO customer 
VALUES (NULL, 'Ally', 'Ly', '5200 Wheeler Ave, La Verne, CA 91750', '3444', '1231231231'),
	(NULL, 'Carlos', 'Rodriguez', '1225 N Grand Ave, Walnut, CA 91789', '1111', '1111111111'),
    (NULL, 'Melvin', 'Gitbumrungsin', '5555 Nothing Way, Pomona, CA 90000', '2222', '3213213213');

INSERT INTO restaurant
VALUES (NULL, 'JJ Boba', '3560 WEST TEMPLE STE A Pomona, CA 91768', '9098968318', 'JJBoba', '1234');
    
INSERT INTO orders
VALUES (NULL, 1, 1, NULL, 19.99, 0, 0),
	(NULL, 2, 1, NULL, 8.57, 0, 0),
    (NULL, 3, 1, NULL, 5.47, 0, 0);

INSERT INTO driver
VALUES (NULL, 'Laurence Timothy Manalo Garcia', 'Honda Civic', '22222222', 'Laurence', '1234');