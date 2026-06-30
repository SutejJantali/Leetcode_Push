1class Solution {
2    public int numberOfSubstrings(String s) {
3        int[] freq = new int[3];
4        int left = 0, res = 0;
5        for (int right = 0; right < s.length(); right++){
6            freq[s.charAt(right) - 'a'] += 1;
7
8            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
9                res += s.length() - right;
10                freq[s.charAt(left) - 'a'] -= 1;
11                left += 1;
12            }
13        }
14
15        return res;
16    }
17}