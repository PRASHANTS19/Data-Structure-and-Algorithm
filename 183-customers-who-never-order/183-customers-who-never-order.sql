# Write your MySQL query statement below
select c.name as Customers
from Customers c 
where c.id NOT IN (select distinct(customerId) from orders );