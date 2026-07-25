class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        if (checkArr(nums, n)) {
            return true;
        }
        return false;
    }

    public static boolean checkArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}