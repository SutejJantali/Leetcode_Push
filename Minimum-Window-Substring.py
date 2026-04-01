1class Solution:
2    def minWindow(self, s: str, t: str) -> str:
3        if len(s) < len(t):
4            return ""
5
6        char_cnt = defaultdict(int)
7        for ch in t:
8            char_cnt[ch] += 1
9        
10        req_char = len(t)
11
12        min_window = (0, float("inf"))
13        start_ind = 0
14
15        for end_ind, ch in enumerate(s):
16            if char_cnt[ch] > 0:
17                req_char -= 1
18            char_cnt[ch] -= 1
19
20            if req_char == 0:
21                while True:
22                    window_start = s[start_ind]
23                    if char_cnt[window_start] == 0:
24                        break
25                    char_cnt[window_start] += 1
26                    start_ind += 1
27
28                if end_ind - start_ind < min_window[1] - min_window[0]:
29                    min_window = (start_ind, end_ind)
30
31                char_cnt[s[start_ind]] += 1
32                req_char += 1
33                start_ind += 1
34
35        return "" if min_window[1] > len(s) else s[min_window[0]:min_window[1]+1]