1class Solution {
2    public boolean judgeCircle(String moves) {
3        int l = 0, r = 0, u = 0, b = 0;
4        for (int i = 0; i < moves.length(); i++){
5            if (moves.charAt(i) == 'U')
6            u += 1;
7            else if (moves.charAt(i) == 'D')
8            b += 1;
9            else if (moves.charAt(i) == 'L')
10            l += 1;
11            else// if (moves.charAt(i) == 'R')
12            r += 1;
13        }
14
15        if ((l == r) && (u == b))
16        return true;
17
18        return false;
19    }
20}