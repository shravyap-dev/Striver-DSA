// Problem: Palindrome Number (LeetCode 9)
// Pattern: Digit extraction
// Approach: Reverse the number and compare with original
// TC: O(log n), SC: O(1)

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int original = x, reverse = 0;

        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }

        return original == reverse;
    }
}
