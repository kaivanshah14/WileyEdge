create temporary table temp_employee select * from employee;

show full tables;

select * from temp_employee; 

insert into employee values (10, 'Abhishek', 'Kumar', 90000, '2019-08-20', 'IT');
select * from employee; 

-- checking whether temporary table is dynamically connected or not? --
-- The answer is NO, updating employee doesn't update temp_employee --

create temporary table temp_employee2 select * from employee2;
select * from temp_employee2; 
drop table employee2;

-- CONCLUSION --
-- Dropping a table doesn't drop a temporary table and it keeps all the records of temporary table --