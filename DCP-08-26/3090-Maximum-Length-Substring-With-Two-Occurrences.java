class Solution {
    public int maximumLengthSubstring(String s) {
        Map <Integer, Integer> mp = new HashMap<>();
        int left = 0,  res = 0;

        for (int right = 0; right < s.length(); right++){
            mp.put(s.charAt(right) - 'a', mp.getOrDefault(s.charAt(right) - 'a', 0) + 1);

            while (mp.get(s.charAt(right) - 'a') > 2){
                mp.put(s.charAt(left) - 'a', mp.get(s.charAt(left) - 'a') - 1);
                left += 1;
            }

            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}