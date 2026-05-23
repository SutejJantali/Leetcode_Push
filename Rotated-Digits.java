1class Solution {
2    public int rotatedDigits(int n) {
3        int res = 0;
4        for (int i = 1; i <= n; i++){
5            int num = i;
6            boolean hasChange = false, isValid = true;
7
8            while (num > 0){
9                int mod = num % 10;
10                 if (mod == 2 || mod == 5 || mod == 6 || mod == 9){
11                    hasChange = true;
12                }
13                else if (mod == 3 || mod == 4 || mod == 7){
14                    isValid = false;
15                    // break;
16                }
17
18                num /= 10;
19            }
20            if (hasChange && isValid)
21            res += 1;
22        }
23
24        return res;
25    }
26}