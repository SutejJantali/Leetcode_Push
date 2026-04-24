1class Solution {
2    public int furthestDistanceFromOrigin(String moves) {
3        int res = 0, move_r = 0, move_l = 0;
4        for (int i = 0; i < moves.length(); i++){
5            if (moves.charAt(i) == 'L')
6            move_l += 1;
7            else if (moves.charAt(i) == 'R')
8            move_r += 1;
9            else
10            res += 1;
11        }
12
13        return res + Math.abs(move_r - move_l);
14    }
15}