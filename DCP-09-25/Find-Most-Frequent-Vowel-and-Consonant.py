class Solution:
    def maxFreqSum(self, s: str) -> int:
        vow_freq = {}
        cons_freq = {}
        vowels = ["a", "e", "i", "o", "u"]
        for ch in s:
            if ch in vowels:
                vow_freq[ch] = vow_freq.get(ch, 0) + 1
            else:
                cons_freq[ch] = cons_freq.get(ch, 0) + 1
        res = 0
        for key, val in vow_freq.items():
            res = max(res, val)
        
        temp = 0
        for key, val in cons_freq.items():
            temp = max(temp, val)
        
        res += temp

        return res