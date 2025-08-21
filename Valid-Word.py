class Solution:
    def isValid(self, word: str) -> bool:
        if len(word) < 3:
            return False
        vow_flag, cons_flag = False, False
        vowels = ['a', 'e', 'i', 'o', 'u']
        for i in range(len(word)):
            if (word[i].isalpha() == True):
                if word[i].lower() in vowels:
                    vow_flag = True
                else:
                    cons_flag = True
            elif word[i].isdigit() < 0 and word[i].isdigit() >= 10:
                return False
            elif word[i].isalnum() == False:
                return False
        
        return True if vow_flag == True and cons_flag == True else False