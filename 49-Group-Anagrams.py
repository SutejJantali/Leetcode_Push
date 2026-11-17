class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        res = defaultdict(list)

        for st in strs:
            key = "".join(sorted(st))
            res[key].append(st)
            
        return list(res.values())