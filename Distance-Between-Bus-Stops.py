1class Solution:
2    def distanceBetweenBusStops(self, distance: list[int], start: int, destination: int) -> int:
3        if start > destination:
4            start, destination = destination, start
5        clockwise = sum(distance[start:destination])
6        total = sum(distance)
7        return min(clockwise, total - clockwise)