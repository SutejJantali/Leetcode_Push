class Solution {
    public boolean scoreBalance(String s) {
        int res = 0;

        for (int i = 0; i < s.length(); i++){
            res += s.charAt(i) - 'a' + 1;
        }

        int curr = 0;

        for (int i = 0; i < s.length(); i++){
            curr += s.charAt(i) - 'a' + 1;

            if (curr == res - curr)
            return true;
        }

        return false;
    }
}