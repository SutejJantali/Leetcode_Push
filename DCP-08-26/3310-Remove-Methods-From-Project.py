class Solution:
    def remainingMethods(self, n: int, k: int, invocations: List[List[int]]) -> List[int]:
        invoke = defaultdict(list)

        for u, v in invocations:
            invoke[u].append(v)

        vis = [0] * n

        def dfs(node, invoke, vis):
            vis[node] = 1
            for nxt in invoke[node]:
                if not vis[nxt]:
                    dfs(nxt, invoke, vis)

        dfs(k, invoke, vis)

        res = []

        for u, v in invocations:
            if vis[u] == 0 and vis[v] != 0:
                return list(range(n))

        for i in range(n):
            if vis[i] == 0:
                res.append(i)

        return res