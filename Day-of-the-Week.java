1class Solution {
2    public String dayOfTheWeek(int day, int month, int year) {
3        String[] daY = {
4            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
5        };
6        int[] daysOfMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
7        if (leap(year) == true){
8            daysOfMonth[2] = 29;
9        }
10        int daysOfYear = 4; //31st December 1970 is Thursday, so intialize as 4
11
12        //Add the days of the previous years
13        for (int i = 1971; i < year; i++){
14            if (leap(i) == true){
15                daysOfYear += 366;
16            }
17            else
18            daysOfYear += 365;
19        }
20        //Add the days of the previous months
21        for (int i = 1; i < month; i++){
22            daysOfYear += daysOfMonth[i];
23        }
24
25        daysOfYear += day; //Add the current day
26        return daY[daysOfYear % 7];
27    }
28
29    private boolean leap(int year){
30        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
31        return true;
32
33        return false;
34    }
35}