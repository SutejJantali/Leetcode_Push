import heapq
class Solution:
    def maxSubsequence(self, nums: List[int], k: int) -> List[int]:
        vals = [[i, nums[i]] for i in range(len(nums))]

        vals.sort(key = lambda x:-x[1])
        #Sorts the list of pairs by the negative of their values (second element in each pair)

        print(vals)
        vals = sorted(vals[:k])
        print(vals)
        res = [val for idx, val in vals]
        return res

