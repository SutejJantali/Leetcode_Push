class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        for ch in "!?',;.":
           paragraph = paragraph.replace(ch, " ")
        
        words = paragraph.lower().split()

        freq = {}

        for word in words:
            if word not in banned:
                freq[word] = freq.get(word, 0) + 1
        
        res = ""
        count = 0
        for word, word_count in freq.items():
            if word_count > count:
                res = word
                count = word_count
        
        return res