# Write your MySQL query statement below
select distinct employee_id, department_id from Employee
where primary_flag = "Y" OR 
employee_id in 
(SELECT employee_id 
from Employee
group by employee_id
having count(employee_id)=1)