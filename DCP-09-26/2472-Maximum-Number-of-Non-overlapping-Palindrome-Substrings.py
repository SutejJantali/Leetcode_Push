class Solution:
    def maxPalindromes(self, s: str, k: int) -> int:
        n = len(s)
        if k == 1:
            return n

        res = 0
        i = 0
        
        while i <= n - k:
            if self.check(s, i, i + k - 1) == True:
                res += 1
                i += k  # Python's while loop allows manual index skipping
            elif i < n - k and self.check(s, i, i + k) == True:
                res += 1
                i += k + 1
            else:
                i += 1

        return res

    def check(self, s: str, l: int, r: int) -> bool:
        while l < r:
            if s[l] != s[r]:
                return False
            l += 1
            r -= 1
        return True
