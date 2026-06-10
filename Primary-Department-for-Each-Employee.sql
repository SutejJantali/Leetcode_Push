1# Write your MySQL query statement below
2SELECT employee_id, department_id
3FROM Employee
4WHERE primary_flag='Y' OR 
5    employee_id in
6    (SELECT employee_id
7    FROM Employee
8    Group by employee_id
9    having count(employee_id)=1)