class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        Arrays.sort(c);
        List<List<Integer>> ans = new ArrayList<>();
        call(0, c, t, new ArrayList<>(), ans);
        return ans;
    }

    void call(int start,int[] c,int t,List<Integer> a,List<List<Integer>> ans) {
        if(t==0){
            ans.add(new ArrayList<>(a));
            return;
        }
        for(int i = start; i < c.length; i++){
            if(i > start && c[i] == c[i - 1])
                continue;
            if(c[i] > t)
                break;
            a.add(c[i]);
            call(i + 1, c, t - c[i], a, ans);
            a.remove(a.size() - 1);
        }
    }
}