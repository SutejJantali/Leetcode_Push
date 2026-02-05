1class Solution:
2    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
3        res = []
4        word_s1, word_s2 = [], []
5        curr_word = ""
6        for i in range(len(s1)):
7            if s1[i] != ' ':
8                curr_word += s1[i]
9            elif s1[i] == ' ':
10                word_s1.append(curr_word)
11                curr_word = ""
12        if curr_word:
13            word_s1.append(curr_word)
14            curr_word = ""
15
16        for i in range(len(s2)):
17            if s2[i] != ' ':
18                curr_word += s2[i]
19            elif s2[i] == ' ':
20                word_s2.append(curr_word)
21                curr_word = ""
22        
23        if curr_word:
24            word_s2.append(curr_word) 
25
26        print(word_s1)
27        print(word_s2)
28
29        for word in word_s1:
30            if word_s1.count(word) == 1 and word not in word_s2:
31                res.append(word)
32
33        for word in word_s2:
34            if word_s2.count(word) == 1 and word not in word_s1:
35                res.append(word)
36
37        return res
38