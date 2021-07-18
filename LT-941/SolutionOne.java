class SolutionOne {
    public boolean validMountainArray(int[] arr) {
        if(arr == null || arr.length < 3) {
            return false;
        }
        boolean peak = false;
        for (int i=0; i < arr.length - 1; i++) {
            if (i > 0 && arr[i] > arr[i+1]) {
                peak = true;
            } else if (arr[i] == arr[i+1] || (!peak && arr[i] > arr[i+1]) || (peak && arr[i+1] > arr[i])) {
                return false;
            } else {
                continue;
            }
        }
        return peak;
    }
}