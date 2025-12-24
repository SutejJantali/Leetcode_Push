1class Solution:
2    def minimumBoxes(self, apple: List[int], capacity: List[int]) -> int:
3        capacity.sort(reverse=True)
4        total_app = sum(apple)
5        res = 0
6        for i in range(len(capacity)):
7            if total_app <= 0:
8                break
9            
10            total_app -= capacity[i]
11            res += 1
12        
13        return res