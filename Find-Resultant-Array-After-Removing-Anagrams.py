class Solution:
    def removeAnagrams(self, words: List[str]) -> List[str]:
        res = []
        word = words[0]
        res.append(word)
        for new_word in words:
            if sorted(new_word) != sorted(word):
                res.append(new_word)
                word = new_word
        
        return res