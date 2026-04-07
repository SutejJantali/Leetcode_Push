1SELECT DISTINCT l1.num AS ConsecutiveNums
2FROM Logs l1
3WHERE 2 = 
4(
5    SELECT COUNT(l2.id)
6    FROM Logs l2
7    WHERE (l1.num = l2.num) AND (l2.id - l1.id = 1 || l2.id-l1.id = 2)
8)