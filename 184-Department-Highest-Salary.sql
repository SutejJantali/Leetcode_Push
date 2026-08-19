# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary
from department d, employee e
where 
d.id = e.departmentId
and e.salary = (
    select max(salary)
    from employee
    where departmentId = e.departmentId
)