class Solution:
    def beautySum(self, s: str) -> int:
        if s == "":
            return 0
    
        res = 0

        def calculate(str):
            freq = {}

            for c in str:
                if c in freq:
                    freq[c] += 1
                else:
                    freq[c] = 1
            
            get_freq = list(freq.values())

            return max(get_freq) - min(get_freq)
        
        for i in range(len(s)-1):
            for j in range(i+1, len(s)+1):
                str = s[i:j]

                res += calculate(str)

        return res