1class Solution {
2    public int[] diStringMatch(String s) {
3        int[] res = new int[s.length()+1];
4        int i = 0, low = 0, high = s.length();
5        while (i < s.length()){
6            if (s.charAt(i) == 'I'){
7                res[i] = low++;
8                i += 1;
9            }
10            else{
11                res[i] = high--;
12                i += 1;
13            }
14        }
15        res[i] = low;
16        return res;
17    }
18}