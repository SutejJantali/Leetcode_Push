class Solution:
    def divisorSubstrings(self, num: int, k: int) -> int:
        s = str(num)
        res = 0

        for i in range(len(s)-k+1):
            curr = s[i:i+k]
            curr_num = int(curr)

            if curr_num > 0 and num % curr_num == 0:
                res += 1

        return res