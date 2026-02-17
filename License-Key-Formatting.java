1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        String s_withnodash = s.replace("-", "").toUpperCase();
4
5        if (s_withnodash.length() == 0)
6        return "";
7
8        StringBuilder res = new StringBuilder();
9        int count = 0;
10        for (int i = s_withnodash.length()-1; i >= 0; i--){
11            if (count > 0 && count%k == 0){
12                res.append("-");
13            }
14            count += 1;
15            res.append(s_withnodash.charAt(i));
16        }
17
18        return res.reverse().toString();
19    }
20}