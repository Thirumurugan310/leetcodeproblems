class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] arr = new int[r][c];
        int k = 0;
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < cols;j++){
                if(r*c!=rows*cols){
                    return mat;
                }else{
                    arr[k/c][k%c] = mat[i][j];
                    k++;
                }
            }
        }
        return arr;
    }
}