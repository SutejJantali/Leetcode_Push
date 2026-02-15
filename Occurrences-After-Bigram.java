1class Solution {
2    public String[] findOcurrences(String text, String first, String second) {
3        String[] words = text.split(" ");
4        ArrayList<String> res = new ArrayList<>();
5
6        for (int i = 1; i < words.length-1; i++){
7            if (words[i].equals(second) == true && words[i-1].equals(first) == true){
8                res.add(words[i+1]);
9            }
10        }
11
12        return res.toArray(new String[0]);
13    }
14}