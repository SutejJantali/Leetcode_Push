class Solution:
    def numberOfAlternatingGroups(self, colors: List[int]) -> int:
        res = 0
        color = colors + colors
        left = 0
        for right in range(1, len(colors)+2):
            if color[right] != color[right-1]:
                if right - left + 1 > 2:
                    res += 1
            else:
                left = right

        return res