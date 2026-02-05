1class Solution:
2    def hasGroupsSizeX(self, deck: List[int]) -> bool:
3        from math import gcd
4        from collections import Counter
5
6        mp = Counter(deck)
7        counts = list(mp.values())
8        print(mp)
9        print(counts)
10        g = counts[0]
11        for c in counts[1:]:
12            g = gcd(g, c)
13
14        return g >= 2
15