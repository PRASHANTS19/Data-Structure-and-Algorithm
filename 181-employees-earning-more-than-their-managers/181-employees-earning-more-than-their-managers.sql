# Write your MySQL query statement below

select p.name as employee from employee p,employee q
where p.salary>q.salary and p.managerId=q.id;