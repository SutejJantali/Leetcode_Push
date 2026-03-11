1class Solution {
2    public int bitwiseComplement(int n) {
3        if (n == 0)
4        return 1;
5
6        StringBuilder res_str = new StringBuilder();
7
8        while(n > 0){
9            res_str.append(n % 2);
10            n /= 2;
11        }
12
13        StringBuilder res_str_rev = new StringBuilder(res_str).reverse();
14
15        for (int i = 0; i < res_str_rev.length(); i++){
16            if (res_str_rev.charAt(i) == '0'){
17                res_str_rev.setCharAt(i, '1');
18            }
19            else{
20                res_str_rev.setCharAt(i, '0');
21            }
22        }
23        int res = 0;
24
25        for (int i = 0; i < res_str_rev.length(); i++){
26            res = (res*2) + (res_str_rev.charAt(i) - '0');
27        }
28
29        return res;
30    }
31}