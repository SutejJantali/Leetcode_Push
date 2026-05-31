1class Solution:
2    def sumFourDivisors(self, nums: List[int]) -> int:
3        res = 0
4
5        for num in nums:
6            factor_count = 0
7            factor_sum = 0
8
9            i = 1
10
11            while i * i <= num:
12                if num % i == 0:
13                    factor_count += 1
14                    factor_sum += i
15
16                    if (i * i != num): #for ex 16, its factors are 4 & 4 so no extra addition for same factors
17                        factor_count += 1
18                        factor_sum += num // i
19            
20                i += 1
21
22            if factor_count == 4:
23                res += factor_sum
24            
25        
26        return res