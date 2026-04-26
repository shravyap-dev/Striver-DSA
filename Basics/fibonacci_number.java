// Problem: Fibonacci Number (LeetCode 509)
// Pattern: Iteration / DP
// Approach: Iterative using two variables
// TC: O(n), SC: O(1)

class Solution {
    public int fib(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}
