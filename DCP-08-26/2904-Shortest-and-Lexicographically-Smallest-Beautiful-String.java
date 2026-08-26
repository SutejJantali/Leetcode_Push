class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        Set <String> st = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));

        int left = 0;
        for(int right = 0; right < s.length(); right++){
            if (s.charAt(right) == '1'){
                k -= 1;
                if (k == 0){
                    while(s.charAt(left) == '0')
                    left += 1;

                    st.add(s.substring(left, right+1));
                    k += 1;
                    left += 1;
                }
            }
        }

        System.out.println(st);
        return st.stream().findFirst().orElse("");
    }
}