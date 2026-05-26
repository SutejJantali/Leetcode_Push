1class Solution {
2    public int numberOfSpecialChars(String word) {
3        int res = 0;
4        boolean[] seen = new boolean[128];
5
6        for (int i = 0; i < word.length()-1; i++){
7                if (seen[word.charAt(i)] == true){
8                    continue;
9                }
10            for (int j = i + 1; j < word.length(); j++){
11                if (seen[word.charAt(j)] == true){
12                    continue;
13                }
14                if (word.charAt(i) != word.charAt(j) && Character.toUpperCase(word.charAt(i)) == Character.toUpperCase(word.charAt(j))){
15                    seen[word.charAt(i)] = true;
16                    res += 1;
17                    break;
18                }
19            }
20        }
21        return res;
22    }
23}