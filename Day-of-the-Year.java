1class Solution {
2    public int dayOfYear(String date) {
3        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
4
5        int year = Integer.parseInt(date.substring(0,4));
6        int month = Integer.parseInt(date.substring(5,7));
7        int day = Integer.parseInt(date.substring(8, 10));
8
9        if (isleap(year) == true){
10            days[1] = 29;
11        }
12
13        int res = 0;
14
15        for (int i = 0; i < month-1; i++)
16        res += days[i];
17
18        res += day;
19
20        return res;
21    }
22
23    public boolean isleap(int year){
24        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
25        return true;
26
27        return false;
28    }
29}