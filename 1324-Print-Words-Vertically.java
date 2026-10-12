class Solution {
    public List<String> printVertically(String s) {
        ArrayList<String> res = new ArrayList<>();
        int max = 0;

        String[] words = s.split(" ");
        for (String word: words){
            max = Math.max(max, word.length());
        }

        for (int i = 0; i < max; i++){
            StringBuilder sb = new StringBuilder();
            for(String word: words){
                if (i < word.length()){
                    sb.append(word.charAt(i));
                }
                else{
                    sb.append(" ");
                }
            }

            res.add(sb.toString().stripTrailing());
        }

        return res;
    }
}