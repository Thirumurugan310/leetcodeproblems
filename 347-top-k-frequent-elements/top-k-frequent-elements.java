class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums)
            map.put(x,map.getOrDefault(x,0)+1);
        PriorityQueue<Integer> p = new PriorityQueue<>((a,b)-> map.get(b) - map.get(a));
        for(int x : map.keySet())
            p.add(x);
        int[] arr = new int[k];
        for(int i = 0;i  < k;i++)
            arr[i] = p.poll();

        return arr;
    }
}