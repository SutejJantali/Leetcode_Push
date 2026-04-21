1class Solution:
2    def maxDistance(self, nums1: List[int], nums2: List[int]) -> int:
3        i, j, res = 0, 0, 0
4
5        while i < len(nums1) and j < len(nums2):
6            if i <= j and nums1[i] <= nums2[j]:
7                res = max(res, j - i)
8                j += 1
9            else:
10                if i <= j and nums1[i] > nums2[j]:
11                    i += 1
12                elif i > j:
13                    j += 1
14
15        return res
16