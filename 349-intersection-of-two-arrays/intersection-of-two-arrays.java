import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int a : nums1) {
            for (int b : nums2) {
                if (a == b) {
                    set.add(a);
                }
            }
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int x : set) {
            result[i++] = x;
        }
        return result;
    }
}
