package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class T0506_RelativeRanks {
    private static String[] SSP = {"Gold Medal","Silver Medal","Bronze Medal"};
    public String[] findRelativeRanks(int[] score) {
        Map<Integer,Integer> map = new HashMap<>();
        String[] ans =new String[score.length];
        for(int i = 0;i < score.length;i++){
            map.put(score[i],i);
        }
        Arrays.sort(score);
        for(int i = 0;i < score.length;i++){
            int j = score.length - i - 1;
            ans[map.get(score[i])] = j <= 2 ?  SSP[j] : (j + 1) + "";
        }
        return ans;
    }
}
