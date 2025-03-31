class Solution:
    def maxDepth(self, s: str) -> int:
        stack = []
        res = 0
        for i in range(len(s)):
            if s[i] == '(':
                stack.append(s[i])
                res = max(res, len(stack))
            elif s[i] == ')':
                stack.pop()
        
        return res