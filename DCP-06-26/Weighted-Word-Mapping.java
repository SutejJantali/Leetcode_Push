1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder res = new StringBuilder(words.length);
4
5        for (String word : words){
6            int weight_sum = 0;
7            for (int i = 0; i < word.length(); i++){
8                weight_sum += weights[word.charAt(i) - 'a'];
9            }
10            res.append((char) ('z' - (weight_sum % 26)));
11        }
12
13        return res.toString();
14    }
15}