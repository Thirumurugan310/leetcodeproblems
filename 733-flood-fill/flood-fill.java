class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int o = image[sr][sc];
        if(o==color)return image;
        dfs(image,sr,sc,color,o);
        return image;
    }
    void dfs(int[][] image,int i,int j,int color,int o){
        if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j]!= o)return;
        image[i][j] = color;
        dfs(image,i-1,j,color,o);
        dfs(image,i+1,j,color,o);
        dfs(image,i,j-1,color,o);
        dfs(image,i,j+1,color,o);
    }
}