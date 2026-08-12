class Solution {
    public String removeDuplicateLetters(String s) {
        Map <Character, Integer> mp = new HashMap();

        for (int i = 0; i < s.length(); i++){
            mp.put(s.charAt(i), i);
        }

        Stack <Character> st = new Stack<>();
        Set<Character> vis = new HashSet<>();

        for (int i = 0; i < s.length(); i++){
            if (vis.contains(s.charAt(i)))
            continue;

            while (st.isEmpty() == false && s.charAt(i) < st.peek() && i < mp.getOrDefault(st.peek(), -1)){
                vis.remove(st.pop());
            }

            st.push(s.charAt(i));
            vis.add(s.charAt(i));
        }

        StringBuilder res = new StringBuilder();

        for (char ch : st){
            res.append(ch);
        }

        return res.toString();
    }
}