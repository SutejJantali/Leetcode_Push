1# Write your MySQL query statement below
2
3SELECT 
4    product_id
5    ,'store1' AS store
6    ,store1 AS price
7FROM products
8WHERE store1 IS NOT NULL
9
10UNION ALL
11
12SELECT 
13    product_id
14    ,'store2' AS store
15    ,store2 AS price
16FROM products
17WHERE store2 IS NOT NULL
18
19UNION ALL
20
21SELECT 
22    product_id
23    ,'store3' AS store
24    ,store3 AS price
25FROM products
26WHERE store3 IS NOT NULL