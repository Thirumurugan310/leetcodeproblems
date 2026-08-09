class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        ArrayList<ArrayList<Integer>> g = new ArrayList<>();

        // Build graph
        for(int i = 0;i < n;i++){
            g.add(new ArrayList<>());
        }
        for(int[] x : edges){
            int nei = x[0];
            int node = x[1];
            g.get(node).add(nei);
            g.get(nei).add(node);
        }

        boolean[] visited = new boolean[n];
        return dfs(g, visited, source, destination);
    }

    boolean dfs(ArrayList<ArrayList<Integer>> graph,
                boolean[] v,
                int n,
                int d){
                    if(n==d)return true;
                    v[n] = true;
                    for(int ne : graph.get(n)){
                        if(!v[ne]){
                            if(dfs(graph,v,ne,d))return true;
                        }
                    }
                    return false;
    }
}