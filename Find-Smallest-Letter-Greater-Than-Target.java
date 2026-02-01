1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        if (target == 'z'){
4            return letters[0];
5        }
6        char res = 'z';
7        boolean flag = true;
8        for (int i = 0; i < letters.length; i++){
9        if (letters[i] == 'z' && target == 'z'){
10                return 'z';
11        }
12            if (letters[i] > target && letters[i] <= res){
13                flag = false;
14            res = letters[i];
15            } 
16        }
17        if (res == 'z' && flag == true){
18            return letters[0];
19        }
20
21        return res;
22    }
23}