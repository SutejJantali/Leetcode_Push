1class Solution {
2    public boolean isPalindrome(String s) {
3        int j = s.length()-1;
4        for (int i = 0; i < s.length(); i++){
5            while( i < s.length() && Character.isLetterOrDigit(s.charAt(i)) == false)
6            i+= 1;
7
8            while(j > -1 &&Character.isLetterOrDigit(s.charAt(j)) == false)
9            j-= 1;
10
11            if (i < s.length() && j > -1 && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
12            return false;
13            else j-=1;
14        }
15
16        return true;
17    }
18}