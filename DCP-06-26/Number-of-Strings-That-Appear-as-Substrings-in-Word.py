1class Solution:
2    def numOfStrings(self, patterns: List[str], word: str) -> int:
3        res = 0
4
5        for pat in patterns:
6            if pat in word:
7                res += 1
8
9        return res