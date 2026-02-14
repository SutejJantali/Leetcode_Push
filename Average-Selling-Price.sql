1# Write your MySQL query statement below
2SELECT p.product_id, IFNULL(round(SUM(p.price*u.units)/sum(u.units),2),0) as average_price
3FROM Prices p 
4LEFT JOIN UnitsSold u
5ON p.product_id = u.product_id AND 
6u.purchase_date BETWEEN p.Start_date and p.end_date
7GROUP BY p.product_id