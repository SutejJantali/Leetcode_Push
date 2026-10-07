class Solution(object):

    def __init__(self):
        self.valid_expressions = set()
        self.min_removed = float("inf")

    def removeInvalidParentheses(self, s):
        """
        :type s: str
        :rtype: List[str]
        """
        # Reset tracking states before processing the string
        self.valid_expressions = set()
        self.min_removed = float("inf")
        
        # Start the recursive search
        self.backtrack(s, 0, 0, 0, "", 0)
        
        return list(self.valid_expressions)

    def backtrack(self, string, index, left_count, right_count, current_expr, rem_count):
        # Base Case: We processed the entire string
        if index == len(string):
            if left_count == right_count:
                if rem_count < self.min_removed:
                    self.min_removed = rem_count
                    self.valid_expressions = {current_expr}  # Reset set with better solution
                elif rem_count == self.min_removed:
                    self.valid_expressions.add(current_expr)
            return

        current_char = string[index]

        # Case 1: Non-parentheses characters (letters) must be kept
        if current_char != '(' and current_char != ')':
            self.backtrack(string, index + 1, left_count, right_count, current_expr + current_char, rem_count)
            return

        # Case 2: Skip/Ignore the current parenthesis (Simulating Deletion)
        self.backtrack(string, index + 1, left_count, right_count, current_expr, rem_count + 1)

        # Case 3: Keep the current parenthesis (If structurally valid)
        if current_char == '(':
            self.backtrack(string, index + 1, left_count + 1, right_count, current_expr + '(', rem_count)
        elif right_count < left_count:
            self.backtrack(string, index + 1, left_count, right_count + 1, current_expr + ')', rem_count)
