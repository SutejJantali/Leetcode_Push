class Solution:
    def largestGoodInteger(self, num: str) -> str:
        res = ""
        for i in range(len(num)-2):
            s = num[i:i+3]
            if s[0] == s[1] and s[1] == s[2]:
                if res == "" or int(s) > int(res):
                    res = s        
        return res