class Solution {
    public boolean checkIfExist(int[] arr) {
        if (arr.length == 0 || arr == null) {
            return false;
        }
        HashSet set = new HashSet();
        for (int i=0; i<arr.length; i++) {
            if (set.contains(arr[i]*2)) {
                return true;
            } else if (arr[i]%2 == 0 && set.contains(arr[i]/2)) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }
        return false;
    }
}
