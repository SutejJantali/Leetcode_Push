class Solution:
    def stoneGameV(self, stoneValue: List[int]) -> int:
        n = len(stoneValue)
        pre = [0 for _ in range(n + 1)]

        for i in range(n):
            pre[i+1] = pre[i] + stoneValue[i]

        dp = [[-1] * n for _ in range(n)]

        def f(left, right):
            if left >= right:
                return 0
            
            left_sum = 0
            right_sum = pre[right+1] - pre[left]
            res = 0

            if dp[left][right] != -1:
                return dp[left][right]

            for k in range(left, right):
                left_sum += stoneValue[k]
                right_sum -= stoneValue[k]

                if left_sum < right_sum:
                    res = max(res, left_sum + f(left, k))

                elif left_sum > right_sum:
                    res = max(res, right_sum + f(k+1, right))
                    if left_sum >= 2*right_sum:
                        break
                else:
                    res = max(res, left_sum + f(left, k), right_sum + f(k+1, right))    

            dp[left][right] = res

            return res

        return f(0, n-1)