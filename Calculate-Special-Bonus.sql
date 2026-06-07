1# Write your MySQL query statement below
2select employee_id, 
3case 
4    when employee_id % 2 != 0 and name not like 'M%'
5    then salary
6    else 0
7end as bonus
8from employees
9order by employee_id
10