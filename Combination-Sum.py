class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        stack = []
        res = []
        def getsum(stack, index, target, res, sum, candidates):
            if index >= len(candidates):
                if sum == target:
                    res.append(stack.copy())
                return
            
            if sum + candidates[index] <= target:
                stack.append(candidates[index])
                getsum(stack, index, target, res, sum + candidates[index], candidates)
                stack.pop()
            
            getsum(stack, index+1, target, res, sum, candidates)
        

        getsum(stack, 0, target, res, 0, candidates)

        return res