class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        candidates = sorted(candidates)
        res = []
        stack = []
        def getsum(index, candidates, target, sum, res, stack):
            if index >= len(candidates) or sum == target:
                if sum == target:
                    res.append(stack.copy())
                
                return

            for i in range(index, len(candidates)):
                if i != index and candidates[i] == candidates[i-1]:
                    continue
                
                if sum + candidates[i] <= target:
                    stack.append(candidates[i])
                    getsum(i+1, candidates, target, sum + candidates[i], res, stack)
                    stack.pop()

        getsum(0, candidates, target, 0, res, stack)
        return res