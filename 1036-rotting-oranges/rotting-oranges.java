class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int f = 0;
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                if(grid[i][j]==2)q.offer(new int[]{i,j});
                if(grid[i][j]==1)f++;
            }
        }
        int min = 0;
        int[][] r = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty() && f!=0){
            int size = q.size();
            for(int i = 0;i < size;i++){
                int[] m = q.poll();
                for(int[] x : r){
                    int k = m[0] + x[0];
                    int l = m[1] + x[1];
                    if(k>=0 && k<grid.length && l>=0 && l<grid[0].length && grid[k][l]==1){
                        grid[k][l]=2;
                        f--;
                        q.add(new int[]{k,l});
                    }
                }
            }
            min++;
        }return f==0 ? min : -1;
    }
}