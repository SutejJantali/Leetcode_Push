# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:

        def f(s, t):
            if not t and not s:
                return True
            if not t or not s:
                return False

            return (s.val == t.val and f(s.left, t.left) and f(s.right, t.right))

        if f(root, subRoot):
            return True
        
        if root is None:
            return False
        
        return self.isSubtree(root.left, subRoot) or self.isSubtree(root.right, subRoot)