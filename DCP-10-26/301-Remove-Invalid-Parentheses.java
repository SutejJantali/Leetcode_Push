import java.util.*;

class Solution {
    private Set<String> validexp = new HashSet<>();
    private int min_rem;
    
    private void reset() {
        this.validexp.clear();
        this.min_rem = Integer.MAX_VALUE;
    }

    private void recurse(String s, int ind, int leftCount, int rightCount, StringBuilder exp, int rem_count) {
        // Base case: reached the end of the string
        if (ind == s.length()) {
            if (leftCount == rightCount) {
                if (rem_count <= this.min_rem) {
                    String possible_ans = exp.toString();

                    if (rem_count < this.min_rem) {
                        this.validexp.clear();
                        this.min_rem = rem_count;
                    }
                    this.validexp.add(possible_ans);
                }
            }
        } else {
            char currentCharacter = s.charAt(ind);
            int length = exp.length();       

            if (currentCharacter != '(' && currentCharacter != ')') {
                // For non-parentheses characters, we must keep them
                exp.append(currentCharacter);
                this.recurse(s, ind + 1, leftCount, rightCount, exp, rem_count);
                exp.deleteCharAt(length); // Backtrack
            } else {
                // Choice 1: Remove the current parenthesis
                this.recurse(s, ind + 1, leftCount, rightCount, exp, rem_count + 1);
                
                // Choice 2: Keep the current parenthesis
                exp.append(currentCharacter);
                if (currentCharacter == '(') {
                    this.recurse(s, ind + 1, leftCount + 1, rightCount, exp, rem_count);
                } else if (rightCount < leftCount) {
                    this.recurse(s, ind + 1, leftCount, rightCount + 1, exp, rem_count);
                }   
                exp.deleteCharAt(length); // Backtrack
            }
        }
    }

    public List<String> removeInvalidParentheses(String s) {
        this.reset();
        this.recurse(s, 0, 0, 0, new StringBuilder(), 0);
        return new ArrayList<>(this.validexp);
    }
}
