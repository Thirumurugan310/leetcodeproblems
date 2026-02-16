class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int max = events[0][1];
        int result = events[0][0];
        for (int i = 1; i < events.length; i++) {
            int dur = events[i][1]-events[i-1][1]; 
            if(dur > max){
                max = dur;
                result = events[i][0];
            } 
            else if(dur == max){
                result = Math.min(result,events[i][0]);
            }
        }
        return result;
    }
}
