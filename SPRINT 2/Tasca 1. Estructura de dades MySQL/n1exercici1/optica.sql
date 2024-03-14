 DROP DATABASE IF EXISTS Optica;
 CREATE DATABASE Optica;
 USE Optica;
 CREATE TABLE Address (
    AddressID INT AUTO_INCREMENT PRIMARY KEY,
    Street VARCHAR(255) NOT NULL,
    Num INT(9) NOT NULL,
    Floor VARCHAR(10),
    Door VARCHAR(10),
    City VARCHAR(100) NOT NULL,
    PostalCode VARCHAR(20) NOT NULL,
    Country VARCHAR(50) NOT NULL
);
CREATE TABLE Employees (
    EmployeeID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL
);
CREATE TABLE Customers (
    CustomerID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    AddressID INT NOT NULL,
    Telephone VARCHAR(20) NOT NULL,
    Email VARCHAR(100) NOT NULL,
    RegistrationDate DATE NOT NULL,
    RecommendingCustomerID INT,
    SellingEmployeeID INT,
    FOREIGN KEY (AddressID) REFERENCES Address(AddressID),
    FOREIGN KEY (RecommendingCustomerID) REFERENCES Customers(CustomerID),
    FOREIGN KEY (SellingEmployeeID) REFERENCES Employees(EmployeeID)
);
CREATE TABLE Suppliers (
    SupplierID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    AddressID INT NOT NULL,
    Telephone VARCHAR(20) NOT NULL,
    Fax VARCHAR(20) NOT NULL,
    NIF VARCHAR(20) NOT NULL,
    FOREIGN KEY (AddressID) REFERENCES Address(AddressID)
);
CREATE TABLE GlassesBrands (
    BrandID INT AUTO_INCREMENT PRIMARY KEY,
    BrandName VARCHAR(100) NOT NULL
    );
    CREATE TABLE Glasses (
    GlassesID INT AUTO_INCREMENT PRIMARY KEY,
    SupplierID INT NOT NULL,
    BrandID INT NOT NULL,
    LeftGlassGraduation VARCHAR(50),
    RightGlassGraduation VARCHAR(50),
    FrameType ENUM('floating', 'plastic', 'metallic') NOT NULL,
    FrameColor VARCHAR(50),
    LeftGlassColor VARCHAR(50),
    RightGlassColor VARCHAR(50),
    Price DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (SupplierID) REFERENCES Suppliers(SupplierID),
    FOREIGN KEY (BrandID) REFERENCES GlassesBrands(BrandID)
);
CREATE TABLE Sales (
    SaleID INT AUTO_INCREMENT PRIMARY KEY,
    CustomerID INT NOT NULL,
    EmployeeID INT NOT NULL,
    GlassesID INT NOT NULL,
    SaleDate DATE NOT NULL,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID),
    FOREIGN KEY (EmployeeID) REFERENCES Employees(EmployeeID),
    FOREIGN KEY (GlassesID) REFERENCES Glasses(GlassesID)
);

INSERT INTO Address (Street, Num, Floor, Door, City, PostalCode, Country)
VALUES 
    ('Carrer de Balmes', 123, NULL, NULL, 'Barcelona', '08008', 'Spain'),
    ('Carrer Bruc', 456, '2', '1', 'Barcelona', '08015', 'Spain'),
    ('Avinguda Diagonal', 789, NULL, NULL, 'Barcelona', '08034', 'Spain'),
    ('Carrer de Pau Claris', 246, NULL, NULL, 'Barcelona', '08008', 'Spain'),
    ('Passeig de Gràcia', 135, NULL, NULL, 'Barcelona', '08008', 'Spain');
    
INSERT INTO Employees (FirstName, LastName)
VALUES 
    ('Marc', 'Garcia'),
    ('Elena', 'Martinez'),
    ('David', 'Fernandez'),
    ('Laura', 'Lopez');

INSERT INTO Customers (FirstName, LastName, AddressID, Telephone, Email, RegistrationDate, RecommendingCustomerID, SellingEmployeeID)
VALUES 
    ('Javier', 'Gomez', 1, '555-123-4567', 'javier@example.com', '2022-05-10', NULL, 1),
    ('Sofia', 'Rodriguez', 2, '555-234-5678', 'sofia@example.com', '2022-06-15', NULL, 2),
    ('Andrea', 'Fernandez', 3, '555-345-6789', 'andrea@example.com', '2022-07-20', NULL, 3),
    ('Pablo', 'Lopez', 4, '555-456-7890', 'pablo@example.com', '2022-08-25', NULL, 4),
    ('Emma', 'Martinez', 5, '555-567-8901', 'emma@example.com', '2022-09-30', NULL, 1);
    
INSERT INTO Suppliers (FirstName, LastName, AddressID, Telephone, Fax, NIF)
VALUES 
    ('Antonio', 'Sanchez', 1, '655-987-653', '987-876-5432', '12345678A'),
    ('Elena', 'Lopez', 2, '685-876-532', '935-765-432', '98765432B'),
    ('Pedro', 'Garcia', 3, '654-765-321', '936-654-3210', '34567890C'),
    ('Maria', 'Martinez', 4, '632-654-210', '934-543-2109', '89012345D');
    
INSERT INTO GlassesBrands (BrandName)
VALUES 
    ('Gucci'),
    ('Versace'),
    ('Dior'),
    ('Armani');
    
INSERT INTO Glasses (SupplierID, BrandID, LeftGlassGraduation, RightGlassGraduation, FrameType, FrameColor, LeftGlassColor, RightGlassColor, Price)
VALUES 
    (1, 1, '-1.75', '-1.25', 'floating', 'Black', 'Transparent', 'Transparent', 150.00),
    (2, 2, '-2.00', '-1.50', 'plastic', 'Red', 'Smoke', 'Smoke', 200.00),
    (3, 3, '-1.50', '-1.00', 'metallic', 'Blue', 'Transparent', 'Transparent', 180.00),
    (4, 4, '-2.25', '-1.75', 'floating', 'Black', 'Transparent', 'Transparent', 250.00),
    (1, 3, '-1.75', '-1.00', 'plastic', 'Brown', 'Smoke', 'Smoke', 210.00),
    (2, 1, '-1.50', '-1.25', 'metallic', 'Silver', 'Transparent', 'Transparent', 190.00);

INSERT INTO Sales (CustomerID, EmployeeID, GlassesID, SaleDate)
VALUES 
    (1, 1, 1, '2022-05-15'),
    (2, 2, 2, '2022-06-20'),
    (3, 3, 3, '2022-07-25'),
    (4, 4, 4, '2022-08-30'),
    (5, 1, 5, '2022-09-05');
 