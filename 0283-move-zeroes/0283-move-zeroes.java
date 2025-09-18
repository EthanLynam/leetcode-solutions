class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        
        for (int i = 0; i < nums.length; i++) {
            j = i;

            while (j < nums.length && nums[i] == 0) {
                if (nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
                
                else {
                    j++;
                }
            }
        }
    }
}