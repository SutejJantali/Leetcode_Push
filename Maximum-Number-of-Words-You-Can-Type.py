class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        res = 0
        flag = False
        for i in range(len(text)):
            if text[i] in brokenLetters:
                flag = True

            if text[i] == ' ' or i == len(text) - 1:
                if not flag:
                    res += 1
                flag = False   

        return res
