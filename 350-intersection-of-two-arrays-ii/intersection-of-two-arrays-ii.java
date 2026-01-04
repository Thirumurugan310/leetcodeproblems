class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        boolean[] used = new boolean[nums2.length];
        int[] arr = new int[(nums1.length + nums2.length)];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !used[j]) {
                    arr[k++] = nums1[i];
                    used[j] = true;
                    break;
                }
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}
