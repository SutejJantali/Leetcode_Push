1class Solution:
2    def findSubstring(self, s: str, words: List[str]) -> List[int]:
3        if len(s) == 0 or len(words) == 0:
4            return []
5        
6        word_freq = {}
7        for word in words:
8            word_freq[word] = 1 + word_freq.get(word, 0)
9        
10        each_word_len = len(words[0])
11        window_len = each_word_len * len(words)
12
13        res = []
14
15        for i in range(len(s) - window_len + 1):
16            substr_freq = {}
17            j = i
18
19            while j < i + window_len:
20                curr_word = s[j : j + each_word_len]
21
22                if curr_word not in word_freq:
23                    break
24                
25                substr_freq[curr_word] = substr_freq.get(curr_word, 0) + 1
26
27                if substr_freq[curr_word] > word_freq[curr_word]:
28                    break
29                
30                j += each_word_len
31            
32            if j == i + window_len:
33                res.append(i)
34        
35        return res
36
37
38
39
40