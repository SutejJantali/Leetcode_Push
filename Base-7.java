1class Solution {
2    public String convertToBase7(int num) {
3        if (num == 0)
4        return "0";
5
6        boolean neg = num < 0 ? true : false;
7        num = Math.abs(num);
8        StringBuilder res = new StringBuilder();
9
10        while (num > 0){
11            res.append(num % 7);
12            num /= 7;
13        }
14
15        if (neg)
16        res.append("-");
17
18        return res.reverse().toString();
19    }
20}