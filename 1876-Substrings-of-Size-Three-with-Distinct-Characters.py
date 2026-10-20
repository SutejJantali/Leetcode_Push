class Solution:
    def countGoodSubstrings(self, s: str) -> int:
        res = []

        left = 0

        for right in range(3, len(s)+1):
            curr = s[left:right]
            if len(set(curr)) == len(curr):
                res.append(curr)
            
            left += 1

        return len(res)
