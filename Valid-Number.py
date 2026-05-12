1class Solution:
2    def isNumber(self, s: str) -> bool:
3        return bool(match(r'[+-]?(\d+\.?\d*|\.\d+)([eE][+-]?\d+)?$',s))