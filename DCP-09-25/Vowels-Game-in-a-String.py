class Solution:
    def doesAliceWin(self, s: str) -> bool:
        vow = ["a", "e", "i", "o", "u"]  # use a set for faster lookup
        return any(ch in vow for ch in s) 