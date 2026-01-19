1class Solution {
2    public String toHex(int num) {
3        if (num == 0){
4            return "0";
5        }
6
7
8        String hex = "0123456789abcdef";
9        StringBuilder res = new StringBuilder();
10
11        while(num != 0){
12            int dig = num & 15;
13            res.append(hex.charAt(dig));
14            num >>>= 4;
15        }
16
17        return res.reverse().toString();
18    }
19}