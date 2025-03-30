class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        for i in range(len(s)):
            k = i % len(s)

            if s[-k:] + s[:-k] == goal:
                return True
        
        return False