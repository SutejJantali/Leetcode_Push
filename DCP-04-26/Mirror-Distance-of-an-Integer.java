1class Solution {
2    public int mirrorDistance(int n) {
3        if (n / 10 <= 0)
4        return 0;
5
6        int rev = 0;
7        int num = n;
8        while (num > 0){
9            rev = (rev * 10) + (num % 10);
10            num /= 10;
11        }
12        return Math.abs(rev - n);
13    }
14}