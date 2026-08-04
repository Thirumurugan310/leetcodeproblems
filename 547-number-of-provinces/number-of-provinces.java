class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int p = 0;
        boolean[] v = new boolean[n];
        for(int i = 0;i < n;i++){
            if(!v[i]){
                p++;
                dfs(isConnected,v,i);
            }
        }return p;
    }
    void dfs(int[][] m,boolean[] v,int c){
        v[c]= true;
        for(int i = 0;i < m.length;i++){
            if(!v[i] && m[c][i]==1)dfs(m,v,i);
        }
    }
}