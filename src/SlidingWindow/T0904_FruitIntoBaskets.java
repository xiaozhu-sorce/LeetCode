package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-10-17 22:53
 **/
public class T0904_FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int left = 0,right = 0;
        int res = 0;
        int len = fruits.length;
        Map<Integer,Integer> cnt = new HashMap<Integer,Integer>();

        while(right < len){
            cnt.put(fruits[right],cnt.getOrDefault(fruits[right],0) + 1);
            while (cnt.size() > 2){
                cnt.put(fruits[left], cnt.get(fruits[left]) - 1);
                if (cnt.get(fruits[left]) == 0) {
                    cnt.remove(fruits[left]);
                }
                left++;
            }
            res = Math.max(res,right-left+1);
            right++;
        }
        return res;
    }

}
