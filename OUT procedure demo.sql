CREATE DEFINER=`root`@`localhost` PROCEDURE `getCustomerDataTest2`(IN name varchar(50), OUT address varchar(100))
BEGIN 
SELECT customeraddress into address
FROM CUSTOMER WHERE customername = name;

select address;
END