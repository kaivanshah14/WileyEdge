show databases; -- gives all db names on system --

use kaivan_wileyedge; -- use a db --
show tables; -- show tables in that selected db --
show full tables; -- gives all tables with their table type --

show table status where name='employee'; -- gives table status information --

explain select * from employee; -- gives information about the query --

show index from employee; -- shows indexes in a table --

select * from employee;

create index idx1 on employee(first_name,last_name,salary); -- create a composite index --

drop index idx1 on employee; -- delete an index --

create index idx1 on employee(first_name(3)); 
-- create a partial index which takes first 3 characters of first name --

explain select * from employee where first_name like 'bo%'; 
-- since an index is created on first name, the number of rows returned will be 1 instead of --
-- 7 as the searching time is reduced due to indexing --

insert into employee values (8,'Bob', 'Agarwal', 1000000, '2019-01-20', 'Finance');

-- insert into employee values (8,'Jack', 'Khan', 1900, '2019-01-20', 'IT');-- 

create view empview as select * from employee;
-- create a view --

select * from empview;

insert into employee values (9, 'Jack', 'Khan', 1900, '2019-01-20', 'IT');
-- inserting another record to check whether view gets updated dynamically or not --

alter view empview as select * from employee where first_name like "Bo%";
-- altering the view by changing the query --

update empview set first_name = 'Sandipt' where last_name = 'Agarwal' and Employee_id = 8;
-- updating the view updates the table --

check table kaidb.orders; -- check if table is present or not --

