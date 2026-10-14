# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: TreeNode | None) -> list[list[int]]:
        if root == None:
            return []

        res = []

        q = deque([root])
        while q:
            size = len(q)
            temp = []
            for i in range(size):
                node = q.popleft()
                temp.append(node.val)

                if node.left:
                    q.append(node.left)

                if node.right:
                    q.append(node.right)

            res.append(list(temp))


        return res