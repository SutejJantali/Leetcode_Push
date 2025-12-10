1class Solution:
2    def isOneBitCharacter(self, bits: List[int]) -> bool:
3        i = 0
4        while i < len(bits)-1:
5            if bits[i] == 1:
6                i += 1
7            i += 1
8        
9        return i == len(bits)-1