1# Write your MySQL query statement below
2select score, dense_rank() over (order by score desc) as 'rank'
3from scores