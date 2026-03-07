1# Write your MySQL query statement below
2select query_name, 
3round(avg(rating/position), 2) as quality, 
4round((sum(case when rating < 3 then 1 else 0 end)/ count(*))*100, 2) as poor_query_percentage
5from queries
6group by query_name