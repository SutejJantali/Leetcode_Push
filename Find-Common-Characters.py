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

        for w in words[1:]:
            curr_freq = {}
            for j in range(len(w)):
                if w[j] not in curr_freq:
                    curr_freq[w[j]] = 1
                else:
                    curr_freq[w[j]] += 1
            for key, val in freq.items():
                if key in curr_freq:
                    freq[key] = min(freq[key], curr_freq[key])
                else:
                    freq[key] = 0

        for key, val in freq.items():
            res.extend([key] * val)

        return res