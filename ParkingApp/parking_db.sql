CREATE DATABASE IF NOT EXISTS parking_db; USE parking_db;
CREATE TABLE IF NOT EXISTS users(id INT AUTO_INCREMENT PRIMARY KEY,username VARCHAR(50),password VARCHAR(50));
INSERT INTO users(username,password) VALUES('admin','admin123');
CREATE TABLE IF NOT EXISTS vehicles(id INT AUTO_INCREMENT PRIMARY KEY,vehicle_number VARCHAR(20),owner_name VARCHAR(100),vehicle_type VARCHAR(20),entry_time VARCHAR(20),exit_time VARCHAR(20),charges DOUBLE,status VARCHAR(20));
INSERT INTO vehicles(vehicle_number,owner_name,vehicle_type,entry_time,exit_time,charges,status) VALUES('KA01AB1234','Rahul Sharma','4W','09:00','11:00',40,'Exited'),('KA02CD5678','Priya Mehta','2W','10:30','N/A',0,'Parked'),('KA03EF9012','Arjun Singh','4W','11:00','N/A',0,'Parked'),('KA04GH3456','Sneha Rao','Heavy','08:00','12:00',100,'Exited');
