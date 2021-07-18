class SolutionTwo {
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if(arr == null || len < 3) return false;

        int i = 0;
        while (i + 1 < len && arr[i+1] > arr[i]) i++;

        if (i == 0 || i + 1 == len) return false;

        while (i + 1 < len && arr[i] > arr[i+1]) i++;

        return i == len - 1;
    }
}