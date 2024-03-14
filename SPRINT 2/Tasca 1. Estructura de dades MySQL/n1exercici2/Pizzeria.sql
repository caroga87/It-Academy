DROP DATABASE IF EXISTS Pizzeria;
CREATE DATABASE Pizzeria;
USE Pizzeria;

CREATE TABLE Provinces (
	ProvinceID INT NOT NULL AUTO_INCREMENT,
    ProvinceName VARCHAR(30) NOT NULL,
    PRIMARY KEY (ProvinceID)
);
CREATE TABLE Localities (
	LocalityID INT NOT NULL AUTO_INCREMENT,
    LocalityName VARCHAR(30) NOT NULL,
    ProvinceID INT NOT NULL,
    PRIMARY KEY (LocalityID),
    FOREIGN KEY (ProvinceID) REFERENCES Provinces(ProvinceID)
);
CREATE TABLE Clients (
	ClientID INT NOT NULL AUTO_INCREMENT,
    FirstName VARCHAR(20) NOT NULL,
    LastName VARCHAR(60) NOT NULL,
    Address VARCHAR(50) NOT NULL,
    PostalCode INT NOT NULL,
    LocalityID INT NOT NULL,
    PhoneNumber INT NOT NULL,
    PRIMARY KEY (ClientID),
	FOREIGN KEY (LocalityID) REFERENCES Localities(LocalityID)
);
CREATE TABLE Stores (
	StoreID INT NOT NULL AUTO_INCREMENT,
    Address VARCHAR(100) NOT NULL,
    PostalCode INT NOT NULL,
	LocalityID INT NOT NULL,
    PRIMARY KEY (StoreID),
    FOREIGN KEY (LocalityID) REFERENCES Localities(LocalityID)
);
CREATE TABLE Employees (
	EmployeeID INT NOT NULL AUTO_INCREMENT,
    StoreID INT NOT NULL,
    FirstName VARCHAR(20) NOT NULL,
    LastName VARCHAR(60) NOT NULL,
    NIF VARCHAR(9) NOT NULL UNIQUE,
    PhoneNumber INT NOT NULL,
    Role ENUM("cook", "delivery_driver") NOT NULL,
    PRIMARY KEY (EmployeeID),
    FOREIGN KEY (StoreID) REFERENCES Stores(StoreID)
);
CREATE TABLE PizzaCategories (
	PizzaCategoryID INT NOT NULL AUTO_INCREMENT,
    Name VARCHAR(30) NOT NULL UNIQUE,
    PRIMARY KEY (PizzaCategoryID)
);
CREATE TABLE Categories (
	CategoryID INT NOT NULL AUTO_INCREMENT,
    ProductType ENUM("pizza", "burger", "drink") NOT NULL,
	PizzaCategoryID INT,
    PRIMARY KEY (CategoryID),
    FOREIGN KEY (PizzaCategoryID) REFERENCES PizzaCategories(PizzaCategoryID)
);
CREATE TABLE Products (
	ProductID INT NOT NULL AUTO_INCREMENT,
    Name VARCHAR(30) NOT NULL,
	Description VARCHAR(100) NOT NULL,
	Image VARCHAR(100) NOT NULL,
	Price FLOAT NOT NULL,
	CategoryID INT NOT NULL,
	PRIMARY KEY (ProductID),
	FOREIGN KEY (CategoryID) REFERENCES Categories(CategoryID)
);
CREATE TABLE Orders (
	OrderID INT NOT NULL AUTO_INCREMENT,
	ClientID INT NOT NULL, 
	StoreID INT NOT NULL, 
	OrderDateTime DATETIME NOT NULL, 
	DeliveryType ENUM("home_delivery", "click&collect") 	NOT NULL, 
	TotalPrice FLOAT 	NOT NULL, 
	DeliveryDateTime DATETIME, 
	PRIMARY KEY (OrderID), 
	FOREIGN KEY (ClientID) REFERENCES Clients(ClientID), 
	FOREIGN KEY (StoreID) REFERENCES Stores(StoreID)
);
CREATE TABLE OrderProduct (
	OrderID INT NOT NULL, 
	ProductID 	INT NOT NULL, 
	ProductQuantity INT NOT NULL, 
	PRIMARY KEY (OrderID, ProductID), 
	FOREIGN	KEY (OrderID) REFERENCES Orders(OrderID), 
	FOREIGN	KEY (ProductID) REFERENCES Products(ProductId)
);

INSERT INTO Provinces (ProvinceName)
VALUES ('Barcelona'), ('Girona'), ('Tarragona');


INSERT INTO Localities (LocalityName, ProvinceID)
VALUES ('Barcelona City', 1), ('Girona City', 2), ('Tarragona City', 3);


INSERT INTO Clients (FirstName, LastName, Address, PostalCode, LocalityID, PhoneNumber)
VALUES ('Pere', 'Lopez', 'Carrer Perla 49', '08001', 1, '612345679'),
       ('Alicia', 'Suarez', 'Plaça Sense 1', '08002', 2, '633456790'),
       ('Miquel', 'Josep', 'Av. Diagonal 54', '08003', 3, '644567801');

INSERT INTO Stores (Address, PostalCode, LocalityID)
VALUES ('Carrer Mallorca 3', '08001', 1),
       ('Av Grau 4', '08002', 2),
       ('Carrer Ample 1', '08003', 3);

INSERT INTO Employees (StoreID, FirstName, LastName, NIF, PhoneNumber, Role)
VALUES (1, 'Joana', 'Aran', '12345678A', '655234678', 'cook'),
       (2, 'Marc', 'Nuñez', '98765432B', '666345789', 'delivery_driver'),
       (3, 'Noel', 'Garces', '34567890C', '677456890', 'cook');

INSERT INTO PizzaCategories (Name)
VALUES ('Margherita'), ('Pepperoni'), ('Vegetarian');

INSERT INTO Categories (ProductType, PizzaCategoryID)
VALUES ('pizza', 1), ('pizza', 2), ('pizza', 3);

INSERT INTO Products (Name, Description, Image, Price, CategoryID)
VALUES ('Margherita Pizza', 'Classic pizza with tomato sauce and mozzarella cheese.', 'margherita.jpg', 9.99, 1),
       ('Pepperoni Pizza','Delicious pizza topped with spicy pepperoni slices and cheese.', 'pepperoni.jpg', 10.99, 2),
       ('Vegetarian Pizza','Fresh pizza loaded with assorted vegetables and cheese.', 'vegetarian.jpg', 11.99, 3);

INSERT INTO Orders (ClientID, StoreID, OrderDateTime, DeliveryType, TotalPrice)
VALUES (1, 1,'2024-03-14 12:00:00','home_delivery' ,25.50),
       (2, 2,'2024-03-14 13:30:00','click&collect' ,20.75),
       (3, 3,'2024-03-14 15:00:00','home_delivery' ,30.25);
       
 SELECT Products.Name AS Drink, SUM(ProductQuantity) AS SoldQuantity FROM Products 
	JOIN OrderProduct ON Products.ProductID  = OrderProduct.ProductID
    JOIN Orders ON OrderProduct.OrderID = Orders.OrderID
    JOIN Clients ON Orders.ClientID = Clients.ClientID
    WHERE CategoryID  = 3 AND LocalityID = 1
    GROUP BY Products.Name ORDER BY Products.Name;

SELECT Employees.FirstName AS Employee, COUNT(EmployeeID) AS ComandesEfectuades FROM Employees
	JOIN Orders ON Employees.StoreID = Orders.StoreID
    GROUP BY FirstName ORDER BY FirstName;      