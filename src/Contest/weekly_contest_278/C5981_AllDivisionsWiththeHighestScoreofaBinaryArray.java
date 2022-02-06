package Contest.weekly_contest_278;

import java.util.LinkedList;
import java.util.List;

public class C5981_AllDivisionsWiththeHighestScoreofaBinaryArray {
    public List<Integer> maxScoreIndices(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        int len = nums.length;
        int m = Integer.MIN_VALUE;
        int l = 0,r = 0;
        int i;
        for( i = 0 ; i < len; i++){
            if(nums[i] == 1){
                r++;
            }
        }
        m = l + r;
        list.add(0);
        for( i = 0 ; i < len ; i++){
            if(nums[i] == 0)
                l++;

            if(nums[i] == 1)
                r--;

            if( l + r > m){
                m = l + r;
                list.clear();
                list.add(i+1);
            }else if(l + r == m){
                list.add(i+1);
            }

        }

        return list;
    }
}
