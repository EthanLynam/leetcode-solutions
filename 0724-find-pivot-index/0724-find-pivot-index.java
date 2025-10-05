class Solution {
    public int pivotIndex(int[] nums) {

        int total = 0, left = 0;

        for (int i = 0; i < nums.length; i++) {
            total +=  nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && (total - nums[i]) == 0) {
                return 0;
            }

            left += nums[i];

            if ((left - nums[i]) == (total - left)) {
                return i;
            }
        }

        return -1;
    }
}