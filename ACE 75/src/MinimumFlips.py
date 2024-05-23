class Solution:
    def minFlips(self, a, b, c):
        ans = 0
        while a or b or c:
            a_bit = 0 if a%2 == 0 else 1
            b_bit = 0 if b%2 == 0 else 1
            c_bit = 0 if c%2 == 0 else 1
            a, b, c = a/2, b/2, c/2
            if a_bit == 1 and b_bit == 1 and c_bit == 0:
                ans += 2
            elif (a_bit*b_bit*c_bit==0) and a_bit + b_bit != c_bit:
                ans += 1
        return ans