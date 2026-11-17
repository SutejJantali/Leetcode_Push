class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        setdict = set(nums)
        res = 0
        curr_cnt = 0

        for num in setdict:
            if num - 1  not in setdict:
                curr_ele = num
                curr_cnt = 1

                while curr_ele + 1 in setdict:
                    curr_cnt += 1
                    curr_ele += 1

            res = max(res, curr_cnt)
            
        return res