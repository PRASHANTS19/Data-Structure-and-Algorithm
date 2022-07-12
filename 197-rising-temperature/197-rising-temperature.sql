# Write your MySQL query statement below

select p.id from weather p,weather q
where p.temperature>q.temperature 
and DATEDIFF(p.recordDate , q.recordDate) = 1