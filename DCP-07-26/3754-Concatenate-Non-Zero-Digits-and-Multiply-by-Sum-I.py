class Solution:
    def sumAndMultiply(self, n: int) -> int:
        if n == 0:
            return 0
            
        num_str = str(n)
        x, num_sum = "", 0
        for i in range(len(num_str)):
            if int(num_str[i]) > 0:
                x += num_str[i]
        
        for i in range(len(x)):
            num_sum += int(x[i])
        
        x = int(x)
        return x*num_sum