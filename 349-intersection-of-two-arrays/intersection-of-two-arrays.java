import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums1)set.add(x);
        HashMap<Integer,Integer> map = new HashMap<>();
        int c = 0;
        for(int x : nums2){
            if(set.contains(x) && !map.containsKey(x)){
                map.put(x,1);c++;
            }
        }
        int[] a = new int[c];c = 0;
        for(int x: map.keySet())a[c++]=x;
        return a;
    }
}
