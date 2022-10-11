CREATE DEFINER=`root`@`localhost` PROCEDURE `getCustomerDataTest`(IN name varchar(50))
BEGIN 
DECLARE cc bigint;
DECLARE cname varchar(50);  
SELECT customercontact into cc
FROM CUSTOMER WHERE customername = name;

SELECT customername into cname FROM CUSTOMER WHERE customername = name;

select cc, cname;
END