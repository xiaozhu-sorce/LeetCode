package Math;

import java.util.Random;

public class T0398_RandomPickIndex {
    int[] num;

    Random r = new Random();

    public T0398_RandomPickIndex(int[] nums) {
        num = nums;
    }

    public int pick(int target) {
        int res = 0;
        int size = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target){
                size++;
                if(0 == r.nextInt(size)){
                    res = i;
                }
            }
        }
        return res;
    }
}
