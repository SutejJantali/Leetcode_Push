1class Solution:
2    def isBoomerang(self, points: List[List[int]]) -> bool:
3        x1, y1 = points[0]
4        x2, y2 = points[1]
5        x3, y3 = points[2]
6
7        return True if (x2 - x1) * (y3 - y1) != (y2 - y1) * (x3 - x1) else False