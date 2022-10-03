-- Drop a table drops a view test --

CREATE TABLE `employee2` (
  `Employee_id` int NOT NULL AUTO_INCREMENT,
  `First_name` varchar(50) DEFAULT NULL,
  `Last_name` varchar(50) DEFAULT NULL,
  `Salary` int DEFAULT NULL,
  `Joining_date` date DEFAULT NULL,
  `Departement` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Employee_id`)
);

select * from employee2;

INSERT INTO Employee2 (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (1, 'Bob', 'Kinto', 1000000, "2019-01-20", "Finance");
INSERT INTO Employee2 (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (2, 'Jerry', 'Kansxo', 6000000, "2019-01-15", "IT");
INSERT INTO Employee2 (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (3, 'Philip', 'Jose', 8900000, "2019-02-05", "Banking");

create view emp2 as select * from employee2;
select * from employee2; -- employee2 is table
select * from emp2; -- emp2 is view 

drop table employee2;

show full tables;

show table status where name='emp2';

-- CONCLUSION --
-- Dropping a table doesn't drop a view however all the records of the view are now null
-- as no reference of that particular record in view is present
-- When the dropped table is created again it updates the view automatically as the view
-- is dynamically present
-- Error Code: 1356. View 'kaivan_wileyedge.emp2' references invalid table(s) or column(s) 
-- or function(s) or definer/invoker of view lack rights to use them
