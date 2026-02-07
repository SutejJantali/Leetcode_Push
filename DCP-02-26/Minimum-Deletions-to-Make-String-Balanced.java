1class Solution {
2    public int minimumDeletions(String s) {
3        int b_left = 0, a_right = 0, i = 0;
4        int[] b_count = new int[s.length()];
5        int[] a_count = new int[s.length()];
6        while (i < s.length()){
7            b_count[i] = b_left;
8            if (s.charAt(i) == 'b'){
9                b_left += 1;
10            }
11            i+=1;
12        }
13        i = s.length()-1;
14        while (i > -1){
15            a_count[i] = a_right;
16            if (s.charAt(i) == 'a'){
17                a_right += 1;
18            }
19            i-=1;
20        }
21        int res = Integer.MAX_VALUE;
22        for (i = 0; i < s.length(); i++){
23            res = Math.min(res, b_count[i]+a_count[i]);
24        }
25        return res;
26    }
27}