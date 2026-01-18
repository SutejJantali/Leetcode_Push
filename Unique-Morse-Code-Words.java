1class Solution {
2    public int uniqueMorseRepresentations(String[] words) {
3        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
4
5        Set <String> set = new HashSet<>();
6
7        for (String word: words){
8            StringBuilder sb = new StringBuilder();
9
10            for (char c: word.toCharArray()){
11                sb.append(code[c-'a']);
12            }
13            set.add(sb.toString());
14        }
15        return set.size();
16    }
17}