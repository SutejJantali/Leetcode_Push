1"""
2# Definition for a Node.
3class Node:
4    def __init__(self, val = 0, neighbors = None):
5        self.val = val
6        self.neighbors = neighbors if neighbors is not None else []
7"""
8
9from typing import Optional
10class Solution:
11    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
12        vis = {}
13
14        if not node:
15            return
16
17        def dfs(curr):
18            if curr in vis:
19                return vis[curr]
20            
21            clone = Node(curr.val, [])
22            vis[curr] = clone
23
24            for neighbor in curr.neighbors:
25                clone_neighbors = dfs(neighbor)
26                clone.neighbors.append(clone_neighbors)
27            
28            return clone
29
30        return dfs(node)
31
32        