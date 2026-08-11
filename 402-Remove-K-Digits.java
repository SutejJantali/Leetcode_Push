class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        stack = []

        for dig in num:
            while len(stack) > 0 and k > 0 and stack[-1] > dig:
                stack.pop()
                k -= 1

            stack.append(dig)
        
        if k > 0:
            stack = stack[:-k]
        
        res = ''.join(stack).lstrip('0')

        if res == '':
            return "0"

        return res