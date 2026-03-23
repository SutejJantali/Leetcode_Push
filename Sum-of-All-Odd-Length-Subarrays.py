1class Solution:
2    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
3        res = 0
4
5        for left in range(len(arr)):
6            for right in range(left, len(arr)):
7                if (right - left + 1) % 2 == 1:
8                    for index in range(left, right+1):
9                        res += arr[index]
10        
11        return res