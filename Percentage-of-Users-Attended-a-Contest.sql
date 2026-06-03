1select 
2contest_id, 
3round(count(distinct user_id) * 100 /(select count(user_id) from Users) ,2) as percentage
4from  Register
5group by contest_id
6order by percentage desc,contest_id