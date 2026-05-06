1CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
2BEGIN
3set N = N - 1;
4  RETURN (
5      # Write your MySQL query statement below.
6    select distinct salary
7    from employee 
8    order by salary desc
9    limit 1 offset N
10  );
11END