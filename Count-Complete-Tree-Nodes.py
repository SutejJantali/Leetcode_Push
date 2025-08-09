# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def countNodes(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        stack = [root]
        res = 1
        while len(stack) > 0:
            curr = stack.pop()
            if curr.left:
                stack.append(curr.left)
                res += 1
            if curr.right:
                stack.append(curr.right)
                res += 1

        return res