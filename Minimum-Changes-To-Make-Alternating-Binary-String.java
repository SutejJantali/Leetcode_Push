1class Solution {
2    public int minOperations(String s) {
3        int num_zeroes = 0, num_ones = 0;
4
5        for (int i = 0; i < s.length(); i++){
6            if (i % 2 == 0){
7            //consider pattern beginning with 0
8                if (s.charAt(i) == '0'){
9                    num_ones += 1; // this is not expected for pattern beginning with 1
10                }
11                else{
12                    num_zeroes += 1; // this is not expected for pattern beginning with 0
13                }
14            }
15            else{
16                //consider pattern beginning with 1
17                if (s.charAt(i) == '1'){
18                    num_ones += 1; // this is not expected for pattern beginning with 1
19                }
20                else{
21                    num_zeroes += 1; // this is not expected for pattern beginning with 0
22                }
23            }
24    }
25
26    return Math.min(num_zeroes, num_ones);
27    }
28}