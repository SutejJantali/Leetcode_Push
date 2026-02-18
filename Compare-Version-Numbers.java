1class Solution {
2    public int compareVersion(String version1, String version2) {
3        String[] v1 = version1.split("\\.");
4        String[] v2 = version2.split("\\.");
5
6        int len = Math.max(v1.length, v2.length);
7        for (int i = 0; i < len; i++){
8            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
9            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
10
11            if (num1 < num2) 
12            return -1;
13            if (num1 > num2)
14            return 1;
15        }
16
17        return 0;
18    }
19}