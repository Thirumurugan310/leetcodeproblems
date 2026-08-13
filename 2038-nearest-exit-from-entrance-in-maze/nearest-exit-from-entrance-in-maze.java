class Solution {
    public int nearestExit(char[][] maze, int[] e) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{e[0],e[1],0});
        int[][] a = {{-1,0} , {1,0} , {0,-1}, {0,1}};
        maze[e[0]][e[1]] = '+';
        while(!q.isEmpty()){
            int[] b = q.poll();
            int b1 = b[0],b2 = b[1];
            int d = b[2];
            for(int i = 0;i < a.length;i++){
                int i1 = b1 + a[i][0];
                int i2 = b2 + a[i][1];
                if(i1 >= 0 && i1 < maze.length && i2 >= 0 && i2 < maze[0].length && maze[i1][i2]!='+'){
                    if( i1==0 || i2==0 || i1==maze.length-1 || i2==maze[0].length-1)
                        return d+1;
                    maze[i1][i2] = '+';
                    q.add(new int[]{i1,i2,d+1});
                    
                }
            }
        }
        return -1;
    }
}