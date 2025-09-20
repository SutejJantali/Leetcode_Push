from collections import Counter
class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        words = sorted(words)
        small_word = words[0]
        res = []
        freq = {}
        for i in range(len(small_word)):
            if small_word[i] not in freq:
                freq[small_word[i]] = 1
            else:
                freq[small_word[i]] += 1

        freq = Counter(freq)
        for w in words[1:]:
            freq &= Counter(w)

        for key, val in freq.items():
            res.extend([key] * val)

        return res