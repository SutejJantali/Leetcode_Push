1# Definition for a binary tree node.
2# class TreeNode:
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7class Solution:
8    def buildTree(self, inorder: List[int], postorder: List[int]) -> Optional[TreeNode]:
9        # Base case
10        if not inorder:
11            return None
12
13        # LAst ele of postorder is root
14        root_val = postorder.pop()
15        # Create root to return
16        root = TreeNode(root_val)
17
18        # Find root got from postorder in inorder list
19        inorder_ind = inorder.index(root_val)
20
21
22        #whatever pos got from inorder if we go to right it belongs to right
23        root.right = self.buildTree(inorder[ inorder_ind + 1:], postorder)
24
25        #whatever pos got from inorder if we go to left it belongs to left        
26        root.left = self.buildTree(inorder[:inorder_ind], postorder)
27
28        return root