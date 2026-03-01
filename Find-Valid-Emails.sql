1# Write your MySQL query statement below
2SELECT user_id, email
3FROM Users
4WHERE email REGEXP '^[a-z0-9_]+@[^@0-9]+\\.com$' order by user_id;