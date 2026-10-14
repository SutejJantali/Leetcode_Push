# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pathSum(self, root: TreeNode | None, targetSum: int) -> list[list[int]]:
        if root is None:
            return []

        if root.val == targetSum and root.left == None and root.right == None:
            return [[root.val]]

        res = []
        final_res = []

        def dfs(root, target, res, sum, final_res):
            if root == None:
                return
            
            sum += root.val
            res.append(root.val)

            if root.left == None and root.right == None and target == sum:
                final_res.append(list(res))
            else:
                dfs(root.left, target, res, sum, final_res)
                dfs(root.right, target, res, sum, final_res)


            res.pop()

        dfs(root, targetSum, res, 0, final_res)

        return final_res