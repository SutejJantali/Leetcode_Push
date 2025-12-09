1class Solution:
2    def specialTriplets(self, nums: List[int]) -> int:
3        mod = 10 ** 9 + 7
4        num_cnt = {}
5        cnt_till_now = {}
6
7        for num in nums:
8            num_cnt[num] = num_cnt.get(num, 0) + 1
9
10        res = 0
11
12        for num in nums:
13            target = num * 2
14            l_cnt = cnt_till_now.get(target, 0)
15            cnt_till_now[num] = cnt_till_now.get(num, 0) + 1
16            r_cnt = num_cnt.get(target, 0) - cnt_till_now.get(target, 0)
17            res = (res + l_cnt * r_cnt) % mod
18        
19        return res