# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: TreeNode | None) -> int:
        if root == None:
            return 0

        def height(root, lvl):
            if root == None:
                return lvl
            
            left = height(root.left, lvl+1)
            right = height(root.right, lvl+1)
            return max(left, right)
        
        return height(root, 0) 