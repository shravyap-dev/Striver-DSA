// Problem: Armstrong Number
// Pattern: Digit extraction
// TC: O(log n), SC: O(1)

class Solution {
    public boolean isArmstrong(int n) {
        int original = n;
        int temp = n;
        int k = 0;
        int sum = 0;

        while (temp > 0) {
            k++;
            temp /= 10;
        }

        temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, k);
            temp /= 10;
        }

        return sum == original;
    }
}
