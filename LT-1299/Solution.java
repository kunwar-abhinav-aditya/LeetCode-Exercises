class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int maxFromRight = arr[len - 1];
        arr[len - 1] = -1;

        for (int i = len - 2; i>=0; i--) {
            int temp = arr[i];
            arr[i] = maxFromRight;

            if (temp > maxFromRight) {
                maxFromRight = temp;
            }
        }
        return arr;
    }
}
