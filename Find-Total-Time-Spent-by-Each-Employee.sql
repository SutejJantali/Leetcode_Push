1# Write your MySQL query statement below
2select
3    event_day as day, emp_id
4    , sum(out_time) - sum(in_time) as total_time
5from 
6    Employees
7group by 
8    event_day, emp_id