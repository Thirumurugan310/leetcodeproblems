class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        call(1,n,k,new ArrayList<>(),ans);
        return ans;
    }
    void call(int i,int n,int k,List<Integer> l,List<List<Integer>> ans){
        if(l.size()==k){
            ans.add(new ArrayList<>(l));return;
        }
        if(i>n)return;
        l.add(i);
        call(i+1,n,k,l,ans);
        l.remove(l.size()-1);
        call(i+1,n,k,l,ans);
    }
}