class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b) -> a[1]-b[1]);
        int c = 1,e = pairs[0][1];
        for(int i = 0;i < pairs.length;i++){
            if(pairs[i][0]>e){
                c++;
                e = pairs[i][1];
            }
        }return c;
    }
}