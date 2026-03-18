1# Write your MySQL query statement below
2select sell_date, count(distinct product) as num_sold,
3    group_concat(distinct product order by product asc separator ',') as products
4from Activities
5group by sell_date