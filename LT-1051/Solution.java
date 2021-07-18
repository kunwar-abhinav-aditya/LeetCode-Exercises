class Solution {
    public int heightChecker(int[] heights) {
        int[] expectedHeights = heights.clone();
        Arrays.sort(expectedHeights);

        int delta = 0;
        for (int i=0; i < expectedHeights.length; i++) {
            if (heights[i] != expectedHeights[i]) {
                delta++;
            }
        }
        return delta;
    }
}
