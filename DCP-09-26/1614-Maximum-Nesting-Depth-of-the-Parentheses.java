class Solution {
    public int maxDepth(String s) {
        int res = 0, curr = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                curr += 1;
                res = Math.max(res, curr);
            }
            else if (s.charAt(i) == ')')
            curr -= 1;
        }

        return res;
    }
}