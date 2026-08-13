class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ll = new ArrayList<>();
        char[][] mat = new char[n][n];
        for(int i = 0;i < n;i++)
            Arrays.fill(mat[i],'.');
        call(0,mat,ll);
        return ll;
    }

    void call(int row,char[][] m,List<List<String>> ll){
        if(row==m.length){
            List<String> l = new ArrayList<>();
            for(int i = 0;i < m.length;i++)
                l.add(new String(m[i]));
            ll.add(l);
            return;
        }
        for(int i = 0;i < m[0].length;i++){
            if(v(m,row,i)){
                m[row][i] = 'Q';
                call(row+1,m,ll);
                m[row][i]='.';
            }
        }
    }

    boolean v(char[][] m,int r,int c){
        for(int i = 0;i < m.length;i++){
            if(m[i][c]=='Q')return false;
        }
        for(int i = r-1,j = c-1;i >=0 && j >=0;i--,j--){
            if(m[i][j]=='Q')return false;
        }
        for(int i = r,j = c;i >= 0 && j < m.length;i--,j++){
            if(m[i][j]=='Q')return false;
        }
        return true;
    }
}