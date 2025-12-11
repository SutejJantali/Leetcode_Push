1class Solution:
2    def kLengthApart(self, nums: List[int], k: int) -> bool:
3        first_one, second_one = 0, 0
4        flag = False
5        for i in range(len(nums)):
6            if nums[i] == 1:
7                if first_one == second_one and flag == False:
8                    first_one = i
9                    flag = True
10                else:
11                    second_one = i
12                    if second_one - first_one <= k:
13                        return False
14                    first_one = second_one
15        
16        return True