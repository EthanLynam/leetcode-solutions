class Solution {
    public boolean isPalindrome(int x) {
        String sb = String.valueOf(x);
        int left = 0, right = sb.length() - 1;

        while (right > left) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;  
    }
}