1# Write your MySQL query statement below
2select actor_id, director_id 
3from(
4select actor_id,director_id, 
5count(timestamp) as cooperated 
6from ActorDirector 
7group by actor_id,director_id) 
8table1
9where cooperated>=3;