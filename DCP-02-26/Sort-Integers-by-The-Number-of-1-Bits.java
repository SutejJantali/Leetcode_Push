1class Solution:
2    def sortByBits(self, arr: List[int]) -> List[int]:
3        def find_weight(num):
4            mask = 1
5            weight = 0
6
7            while num > 0:
8                if num & mask > 0:
9                    weight += 1
10                    num ^= mask
11                
12                mask <<=1
13            return weight
14
15        arr.sort(key = lambda num: (find_weight(num), num))
16
17        return arr