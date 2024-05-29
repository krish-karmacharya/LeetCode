class Solution {
    public boolean isPalindrome(int x) {
        // Special cases: negative numbers and numbers ending with 0 (except 0 itself)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int originalNum = x;
        int reversedNum = 0;

        // Reverse the second half of the number
        while (x > reversedNum) {
            reversedNum = reversedNum * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, ignore the middle digit
        return x == reversedNum || x == reversedNum / 10;
    }
}