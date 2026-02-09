1# Write your MySQL query statement below
2select x, y, z,
3case 
4when x+y>z and x+z>y and y+z>x
5then "Yes"
6else "No"
7end as triangle
8from Triangle