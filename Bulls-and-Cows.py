1class Solution:
2    def getHint(self, secret: str, guess: str) -> str:
3        bulls, cows = 0, 0
4        nums = [0] * 10
5
6        for i in range(len(secret)):
7            if secret[i] == guess[i]:
8                bulls += 1
9            else:
10                if nums[int(secret[i])] < 0:
11                    cows += 1
12                if nums[int(guess[i])] > 0:
13                    cows += 1
14                
15                nums[int(secret[i])] += 1
16                nums[int(guess[i])] -= 1
17        
18        return str(bulls) + "A" + str(cows) + "B"
19#https://leetcode.com/problems/bulls-and-cows/solutions/74621/one-pass-java-solution-by-ruben3-1ynw