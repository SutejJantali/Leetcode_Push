1class Solution:
2    def validateCoupons(self, code: List[str], businessLine: List[str], isActive: List[bool]) -> List[str]:
3        res = []
4        category = ["electronics", "grocery", "pharmacy", "restaurant"]
5        for i in range(len(code)):
6            if isActive[i] == True and businessLine[i] in category:
7                word = code[i]
8                k = 0
9                while k < len(word):
10                    if word[k].isalnum() == False:
11                        if word[k] == '_':
12                            k += 1
13                        else:
14                            break
15                    elif word[k].isalnum() == True:
16                        k += 1
17                    else:
18                        break
19                if k == len(word) and len(word) > 0:
20                    res.append((businessLine[i], word))
21        res.sort(key = lambda x: (x[0], x[1]))
22        return [val for _, val in res]