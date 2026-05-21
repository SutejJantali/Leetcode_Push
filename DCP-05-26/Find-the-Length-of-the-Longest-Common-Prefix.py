1class Solution:
2    def longestCommonPrefix(self, arr1: List[int], arr2: List[int]) -> int:
3        arr1_pre = set()
4
5        for ele in arr1:
6            while (ele not in arr1_pre and ele > 0):
7                arr1_pre.add(ele)
8                ele //= 10
9
10        long_pre = 0
11
12        for ele in arr2:
13            while (ele not in arr1_pre and ele > 0):
14                ele //= 10
15            
16            if ele > 0:
17                long_pre = max(long_pre, len(str(ele)))
18        
19        return long_pre