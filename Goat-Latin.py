1class Solution:
2    def toGoatLatin(self, sentence: str) -> str:
3        res = ""
4        i, word_count = 0, 1
5        vowels = ["a", "e", "i", "o", "u", "A", "E", "I", "O", "U"]
6        while i < len(sentence):
7            if sentence[i] in vowels:
8                while i < len(sentence) and sentence[i] != " ":
9                    res += sentence[i]
10                    i += 1
11                res += "ma"
12                count = word_count
13                word_count += 1
14                while count > 0:
15                    res += "a"
16                    count -= 1
17                if i != len(sentence):
18                   res += " "
19            else:
20                j = i
21                i += 1
22                while i < len(sentence) and sentence[i] != " ":
23                    res += sentence[i]
24                    i += 1
25                
26                res += sentence[j]
27                res += "ma"
28                count = word_count
29                word_count += 1
30                while count > 0:
31                    res += "a"
32                    count -= 1
33                if i != len(sentence):
34                   res += " "
35            
36            i+=1 
37        return res
38            