class Solution:
    def isPrefixString(self, s: str, words: list[str]) -> bool:
        res = ""
        for curr in words:
            res += curr
            if res == s:
                return True

        return False