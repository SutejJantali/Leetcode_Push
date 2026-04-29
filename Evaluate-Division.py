1from typing import List
2
3class Solution:
4    def dfs(self, node: str, dest: str, gr: dict, vis: set, ans: List[float], temp: float) -> None:
5        if node in vis:
6            return
7
8        vis.add(node)
9        if node == dest:
10            ans[0] = temp
11            return
12
13        for ne, val in gr[node].items():
14            self.dfs(ne, dest, gr, vis, ans, temp * val)
15
16    def buildGraph(self, equations: List[List[str]], values: List[float]) -> dict:
17        gr = {}
18
19        for i in range(len(equations)):
20            dividend, divisor = equations[i]
21            value = values[i]
22
23            if dividend not in gr:
24                gr[dividend] = {}
25            if divisor not in gr:
26                gr[divisor] = {}
27
28            gr[dividend][divisor] = value
29            gr[divisor][dividend] = 1.0 / value
30
31        return gr
32
33    def calcEquation(self, equations: List[List[str]], values: List[float], queries: List[List[str]]) -> List[float]:
34        gr = self.buildGraph(equations, values)
35        finalAns = []
36
37        for query in queries:
38            dividend, divisor = query
39
40            if dividend not in gr or divisor not in gr:
41                finalAns.append(-1.0)
42            else:
43                vis = set()
44                ans = [-1.0]
45                temp = 1.0
46                self.dfs(dividend, divisor, gr, vis, ans, temp)
47                finalAns.append(ans[0])
48
49        return finalAns