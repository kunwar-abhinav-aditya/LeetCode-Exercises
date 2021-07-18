class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sorted = new int[nums.length];
        int start = 0, end = nums.length - 1;
        int pointer = end;
        while (start <= end) {
            int powStart = nums[start] * nums[start];
            int powEnd = nums[end] * nums[end];
            if (powEnd > powStart) {
                sorted[pointer--] = powEnd;
                end--;
            } else {
                sorted[pointer--] = powStart;
                start++;
            }
        }
        return sorted;
    }
}
