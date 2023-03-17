/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  shahad
 * Created: Apr 6, 2022
 */

DROP TABLE Customer_Account;
DROP TABLE Customer_Phone;
DROP TABLE Orders;
DROP TABLE Product;
DROP TABLE Customer;
DROP TABLE Consist_of;
DROP TABLE Employee;
DROP TABLE Employee_Account;
CREATE TABLE Customer(
    CID INT NOT NULL GENERATED ALWAYS AS IDENTITY,
    age INT,
    gender char(1),
    Fname varchar(20) NOT NULL,
    Lname varchar(20) NOT NULL,
    address varchar(30),
    mail varchar(50),
    PRIMARY KEY (CID)
);

create table Customer_Account(
Username varchar(20) NOT NULL,
Password varchar(20) NOT NULL,
CID int not null,
primary key (Username),
FOREIGN key (CID) REFERENCES Customer (CID)
);

create table Customer_Phone(
phoneNumber varchar(20) not null ,
CID int not null ,
primary key (phoneNumber , CID),
FOREIGN key (CID) REFERENCES Customer (CID)
);

insert into Customer (age , gender , Fname , Lname , address , mail) values
(20 , 'F' , 'Dana' , 'Saleh' , 'Othman street , Dammam' , 'dndn.o.s.4@hotmail.com'),
(22 , 'F' , 'Haya' , 'Alzahim' , '55 street , Dammam ' , 'Haya_alzahim@hotmail.com');

insert into Customer_Account(Username , Password , CID) values
('Dana_1g' , 'Dana.12345' , 1),
('Haya123' , 'Haya_123456' , 2);


insert into Customer_Phone(phoneNumber , CID) values
('0595000340' , 1),
('0500049111' , 1),
('05038745151', 2);

create table Product(
Pro_ID int not null,
Pro_Name varchar(50)not null ,
Pro_Price double not null,
Pro_Quantity int not null,
primary key (Pro_ID)
);

insert into Product (Pro_ID , Pro_Name , Pro_Price , Pro_Quantity) values
(1 , 'Cheesecake' , 100 , 7),
(2 , 'Naked cake' , 75 , 5),
(3 , 'Sponge cake' , 145 , 10),
(4 , 'Yeast Donuts' , 14 , 20),
(5 , 'Donut Holes' , 13.25 , 20),
(6, 'Filled Donuts' , 15 , 12),
(7, 'Long johns Donuts' , 14 , 20),
(8 , 'Croissant Plain' , 10 , 30),
(9 , 'Croissant Zatar' , 12.5 , 30),
(10 , 'Croissant Chedder' , 15 , 15),
(11, 'Croissant Phili Cheese' , 15 , 15),
(12, 'Garlic Bread' , 6.5 , 15),
(13, 'White Toast' , 3.5 , 30),
(14, 'Brown Toast' , 3.5 , 30),
(15, 'Sandwich' , 21.75 , 14);

CREATE TABLE Orders (
orderNumber INT NOT NULL,
customer_ID INT NOT NULL,
totalPrice DOUBLE NOT NULL,
primary key (orderNumber),
foreign key (customer_ID) references Customer(CID)
);
INSERT INTO Orders(orderNumber , customer_ID , totalPrice) values
(1 , 1 , 100);

CREATE TABLE Consist_Of (
orderNumber INT NOT NULL,
product_ID INT NOT NULL,
flavor VARCHAR(10),
toppings VARCHAR(40),
primary key (orderNumber , Product_ID),
foreign key (orderNumber) references Orders(orderNumber),
foreign key (Product_ID) references Product(Pro_ID) 
);

CREATE TABLE Employee(
Employee_ID INT NOT NULL,
Fname varchar(20) NOT NULL,
Lname varchar(20) NOT NULL,
hours DOUBLE,
address varchar(30),
age INT,
salary_per_hour DOUBLE,
mail varchar(30),
MAG_ID INT,
primary key (Employee_ID)
);

CREATE TABLE Employee_Account (
username varchar(20) not null,
password varchar(20) not null,
EID INT NOT NULL ,
PRIMARY KEY (username),
FOREIGN KEY (EID) references Employee (Employee_ID)
);


ALTER TABLE Employee ADD CONSTRAINT forg FOREIGN KEY (MAG_ID)REFERENCES Employee(Employee_ID);

 -- this is the Manager:
insert into Employee (Employee_ID , Fname , Lname , hours , address , age  , salary_per_hour, mail )values 
(1  , 'Basma' , 'Aljalaq' , 10.5 , 'Alkhobar' , 21, 750.00 ,'basmaadnan810@gmail.com');
insert into Employee_Account (username , password , EID) values ('Basma_21' , 'Basma_21' , 1);
 
insert into Employee (Employee_ID , Fname , Lname , hours , address , age, salary_per_hour ,mail, MAG_ID)values
(2 , 'Asma' , 'Alharbi' , 5 , 'Alkhobar' , 24 ,500.00,'asma.alharbi103@gmail.com' ,1),
(3 , 'Maryam' , 'Aldowerij' , 6 , 'Dammam' , 26 ,590.00 ,'memo.maryam27@gmail.com', 1),
(4 , 'Nawir' , 'Aldossary' , 5.75 , 'Dammam' , 28  ,580.00,'nawir4700@gmail.com', 1),
(5 , 'Shahad' , 'Alghareeb' , 6.5 , 'Alkhobar' , 24 ,600.00,'Shahadd9900@gmail.com' ,1);

insert into Employee_Account (username , password ,EID) values 
('Asma_24','Asma_24' ,2),
('Maryam_26' , 'Maryam_26',3),
('Nawir_28' , 'Nawir_28',4),
('Shahad_24' , 'Shahad_24',5);



insert into Employee_Account (username , password ,EID) values ('Shahad_24' , 'Shahad_24',5);
SELECT * From Product;
SELECT * FROM Orders;
SELECT * FROM Customer;
SELECT * FROM Employee;
SELECT * FROM Employee_Account;
SELECT * FROM Customer_Account;

