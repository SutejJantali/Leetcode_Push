1class Solution:
2    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
3        res = 0
4        for i in range(len(num)):
5            res = res*10 + num[i]
6        
7        res += k
8        res_arr = []
9        while (res > 0):
10            res_arr.append(res%10)
11            res //= 10
12
13        return list(reversed(res_arr))