1class Solution:
2    def separateDigits(self, nums: List[int]) -> List[int]:
3        res = []
4        for num in nums:
5            s = str(num)
6
7            for ch in s:
8                res.append(int(ch))
9        
10        return res