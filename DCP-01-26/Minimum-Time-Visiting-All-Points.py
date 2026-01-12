1class Solution:
2    def minTimeToVisitAllPoints(self, points: List[List[int]]) -> int:
3        res = 0
4
5        for i in range(len(points)-1):
6            curr_x = points[i][0]
7            curr_y = points[i][1]
8
9            target_x = points[i+1][0]
10            target_y = points[i+1][1]
11
12            res += max(abs(target_x - curr_x), abs(target_y - curr_y))
13        
14        return res