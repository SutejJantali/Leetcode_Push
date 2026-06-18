1class Solution:
2    def angleClock(self, hour: int, minutes: int) -> float:
3        minangle = 6.0 * minutes
4        hourangle = 30.0 * (hour % 12) + 0.5 * minutes
5
6        diff = abs(hourangle - minangle)
7
8        return min(diff, 360.0 - diff)
9#https://leetcode.com/problems/angle-between-hands-of-a-clock/solutions/8340852/simple-math-video-solution-availalbe-by-cgqnt