1class Solution:
2    def longestValidParentheses(self, s: str) -> int:
3        stack = [-1]
4        res = 0
5
6        for i in range(len(s)):
7            if s[i] == "(":
8                stack.append(i)
9            else:
10                stack.pop()
11                if len(stack) == 0:
12                    stack.append(i)
13                else:
14                    res = max(res, i - stack[-1])
15        return res
16
17#         Start: stack = [-1]
18# i=0 '(': stack = [-1, 0]
19# i=1 ')': Pop 0. Stack is [-1]. max_len = max(0, 1 - (-1)) = 2.
20# i=2 '(': stack = [-1, 2]
21# i=3 ')': Pop 2. Stack is [-1]. max_len = max(2, 3 - (-1)) = 4