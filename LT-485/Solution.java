class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int maxReal = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                max = 0;
            } else {
                max++;
                if (max > maxReal) {
                    maxReal = max;
                }
            }
        }
        return maxReal;
    }
}
