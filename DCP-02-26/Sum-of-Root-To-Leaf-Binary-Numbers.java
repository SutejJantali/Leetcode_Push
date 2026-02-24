1# Definition for a binary tree node.
2# class TreeNode:
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7class Solution:
8    def sumRootToLeaf(self, root: Optional[TreeNode]) -> int:
9        def sumoflastnodes(root, lastsum):
10            if not root:
11                return 0
12            
13            lastsum = lastsum*2 + root.val
14
15            if not root.left and not root.right:
16                return lastsum
17            
18            return sumoflastnodes(root.left, lastsum) + sumoflastnodes(root.right, lastsum)
19
20        return sumoflastnodes(root, 0)