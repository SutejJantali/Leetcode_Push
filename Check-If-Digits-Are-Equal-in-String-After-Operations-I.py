class Solution:
    def hasSameDigits(self, s: str) -> bool:
        s_list = list(s)
        n = len(s)
        for i in range(1,n-1):
            for j in range(n-i):
                dig1 = ord(s_list[j]) - ord("0")
                dig2 = ord(s_list[j+1]) - ord("0")

                s_list[j] = chr(((dig1 + dig2)%10) + ord("0"))

        return s_list[0] == s_list[1]

