1class Solution:
2    def earliestFinishTime(self, landStartTime: List[int], landDuration: List[int], waterStartTime: List[int], waterDuration: List[int]) -> int:
3        res = float('inf')
4
5        for i in range(len(landStartTime)):
6            for j in range(len(waterStartTime)):
7                land = landStartTime[i] + landDuration[i]
8                land_nextwater = max(land, waterStartTime[j]) + waterDuration[j]
9
10                res = min(res, land_nextwater)
11
12                water = waterStartTime[j] + waterDuration[j]
13                water_nextland = max(water, landStartTime[i]) + landDuration[i]
14
15                res = min(res, water_nextland)
16        
17        return res