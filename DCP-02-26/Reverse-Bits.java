1class Solution {
2    public int reverseBits(int n) {
3        int res = 0;
4        for (int i = 0; i < 32; i++){
5            res <<= 1;
6            res |= (n&1);
7            n >>= 1;
8        }
9
10        return res;
11    }
12}