1class Solution:
2    def canPartitionGrid(self, grid: List[List[int]]) -> bool:
3        total_sum = sum(sum(row) for row in grid)
4        if total_sum % 2 != 0:
5            return False
6
7        target_sum = total_sum // 2
8        res_sum = 0
9
10        for i in range(len(grid)):
11            res_sum += sum(grid[i])
12            
13            if res_sum == target_sum:
14                return True
15        
16        res_sum = 0
17
18        for j in range(len(grid[0])):
19            for i in range(len(grid)):
20                res_sum += grid[i][j]
21            
22            if res_sum == target_sum:
23                return True
24        
25        return False