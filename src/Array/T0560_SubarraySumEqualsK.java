package Array;

import java.util.HashMap;
import java.util.Map;

public class T0560_SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int[] num = new int[nums.length+1];
        num[0] = 0;
        for (int i = 1;i < num.length;i++){
            num[i] = num[i-1] + nums[i-1];
            System.out.println(num[i]);
        }

        for(int i = 0;i < num.length; i++){
            for(int j = i+1;j < num.length; j++){
                System.out.println(num[i] + "," +num[j]);
                if(num[j] - num[i] == k)
                    count++;
            }
        }
        return count;
    }

    public int subarratSum2(int[] nums, int k){
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int num0_i = 0,num0_j = 0;
        for (int i  = 0; i < nums.length;i++){
            num0_i+=nums[i];
            num0_j = num0_i-k;
            if(map.containsKey(num0_j))
                count+=map.get(num0_j);
            map.put(num0_i,map.getOrDefault(num0_i,0) + 1);
        }
        return count;
    }
}
