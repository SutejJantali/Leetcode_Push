1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        int res = -1;
4        while (n > 0){
5            int curr = n % 2;
6            if (res == -1)
7            res = curr;
8            else{
9                if (res == curr){
10                    return false;
11                }
12                res = n % 2;
13            }
14            n /= 2;
15        }
16
17        return true;
18    }
19}