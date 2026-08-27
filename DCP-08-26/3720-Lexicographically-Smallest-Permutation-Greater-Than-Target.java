class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] cnt = new int[26];

        for(char ch : s.toCharArray()){
            cnt[ch - 'a'] += 1;
        }

        for (char ch : target.toCharArray()){
            cnt[ch - 'a'] -= 1;
        }

        for (int i = target.length() - 1; i > -1; i--){
            int curr = target.charAt(i) - 'a';
            cnt[curr]+=1;

            boolean ok = true;
            for(int x : cnt){
                if (x < 0) {
                    ok = false;
                    break;
                }
            } 

            if (ok == false){
                continue;
            }

            int next = -1;
            for (int c = curr + 1; c < 26; c++){
                if (cnt[c] > 0){
                    next = c;
                    break;
                }
            }

            if (next == -1){
                continue;
            }

            cnt[next] -= 1;

            StringBuilder res = new StringBuilder(target.substring(0, i));

            res.append((char) ('a' + next));

            for (int c = 0; c < 26; c++){
                while (cnt[c]-- > 0)
                res.append((char) ('a' + c));
            }

            return res.toString();
        }

        return "";
    }
}