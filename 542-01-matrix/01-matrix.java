class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] v = new boolean[mat.length][mat[0].length];
        for(int i = 0;i < mat.length;i++){
            for(int j = 0;j < mat[0].length;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                    v[i][j]= true;
                }
            }
        }
        int[][] a = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        while(!q.isEmpty()){
            int[] m = q.poll();
            for(int[] x : a){
                int k = m[0] + x[0];
                int l = m[1] + x[1];
                 if (k >= 0 && l >= 0 &&
                    l < mat[0].length && k < mat.length &&
                    !v[k][l]){
                        mat[k][l] = mat[m[0]][m[1]] + 1;
                        v[k][l] = true;
                        q.offer(new int[]{k,l});
                    }
            }
        }
        return mat;
    }
}