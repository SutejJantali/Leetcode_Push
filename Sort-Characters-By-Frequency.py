class Solution:
    def frequencySort(self, s: str) -> str:
        mapfreq = {}
        for i in range(len(s)):
            if s[i] in mapfreq:
                mapfreq[s[i]] += 1
            else:
                mapfreq[s[i]] = 1
        
        sorted_char = sorted(mapfreq.keys(), key = lambda x: -mapfreq[x])

        return ''.join(char * mapfreq[char] for char in sorted_char)
