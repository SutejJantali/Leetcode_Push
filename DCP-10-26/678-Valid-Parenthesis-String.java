class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open.push(i);
            } else if (s.charAt(i) == '*') {
                star.push(i);
            } else {
                if (open.isEmpty() == false) {
                    open.pop();
                } else if (star.isEmpty() == false) {
                    star.pop();
                } else {
                    return false;
                }
            }
        }

        while (open.isEmpty() == false) {
            if (star.isEmpty() == true) {
                return false;
            }

            if (open.pop() > star.pop()) {
                return false;
            }
        }

        return true;
    }
}