1class Solution {
2    public String reverseOnlyLetters(String s) {
3        char[] res = s.toCharArray();
4        int i = 0, j = s.length()-1;
5
6        while (i < j){
7            if (Character.isLetter(res[i]) == false){
8                i+=1;
9            }
10            else if (Character.isLetter(res[j]) == false){
11                j-=1;
12            }
13            else{
14                char temp = res[i];
15                res[i] = res[j];
16                res[j] = temp;
17                i += 1;
18                j-=1;
19            }
20        }
21
22        return new String(res);
23    }
24}