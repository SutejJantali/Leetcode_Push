1class Solution:
2    def countCharacters(self, words: List[str], chars: str) -> int:
3        total_cnt = defaultdict(int)
4        for c in chars:
5            total_cnt[c] += 1
6        
7        res = 0
8        for word in words:
9            word_charcnt = defaultdict(int)
10
11            for c in word:
12                word_charcnt[c] += 1
13
14            exists = True
15
16            for c, freq in word_charcnt.items():
17                if total_cnt[c] < freq:
18                    exists = False
19                    break
20                
21            
22            if exists:
23                res += len(word)
24            
25        return res