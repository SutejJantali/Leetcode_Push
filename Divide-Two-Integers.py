1class Solution:
2    def divide(self, dividend: int, divisor: int) -> int:
3        if dividend == divisor:
4            return 1
5        
6        if dividend == -2**31 and divisor == -1:
7            return (2**31) - 1
8        
9        if divisor == 1:
10            return dividend
11        
12        sign = -1 if (dividend < 0) ^ (divisor < 0) else 1
13
14        n, d = abs(dividend), abs(divisor)
15        res = 0
16
17        while n >= d:
18            p = 0
19            while n >= (d << p): # d << p is equivalent to d * (2^p)
20                p += 1
21            
22            p -= 1           # Step back to the largest power that fits
23            n -= (d << p)    # Subtract that chunk from n
24            res += (1 << p)  # Add that power of 2 to our result
25    
26        return min(max(sign * res, -2 ** 31), 2 ** 31 - 1)