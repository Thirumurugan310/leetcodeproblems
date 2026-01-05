import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        int[] arr = score.clone();
        Arrays.sort(arr);
        for (int i = n - 1; i >= 0; i--) {
            int rank = n - i;
            for (int j = 0; j < n; j++) {
                if (score[j] == arr[i]) {
                    if (rank == 1)
                        result[j] = "Gold Medal";
                    else if (rank == 2)
                        result[j] = "Silver Medal";
                    else if (rank == 3)
                        result[j] = "Bronze Medal";
                    else
                        result[j] = String.valueOf(rank);
                }
            }
        }
        return result;
    }
}
