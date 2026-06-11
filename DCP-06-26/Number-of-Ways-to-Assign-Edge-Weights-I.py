1class Solution:
2    def assignEdgeWeights(self, edges: List[List[int]]) -> int:
3        mod = 1_000_000_007
4        n = len(edges) + 1
5
6        graph = [[] for _ in range(n+1)]
7
8        for u, v in edges:
9            graph[u].append(v)
10            graph[v].append(u)
11
12        def dfs(node: int, prev:int) -> int:
13            d = 0
14            for c in graph[node]:
15                if c != prev:
16                    d = max(d, dfs(c, node) + 1)
17            
18            return d
19
20        return pow(2, dfs(1, 0)-1, mod)
21
22# https://leetcode.com/problems/number-of-ways-to-assign-edge-weights-i/solutions/8326725/1-by-gevajat389-cxku