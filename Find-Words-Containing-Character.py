class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        res = []
        index = 0
        for word in words:
            if x in word:
                res.append(index)

            index += 1
        
        return res