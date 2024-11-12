package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-22 17:07
 **/
public class T0015_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        int lo, hi;
        for (int i = 0; i < nums.length; i++) {
            hi = nums.length - 1;
            for (lo = i + 1; lo < hi; lo++) {
                if (lo > i + 1 && nums[lo] == nums[lo - 1]) continue;
                if (hi < nums.length - 1 && nums[hi] == nums[hi + 1]) {
                    hi--;
                    continue;
                }
                int res = nums[i] + nums[lo] + nums[hi];
                if (res == 0) {
                    List<Integer> li = new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[lo]);
                    li.add(nums[hi]);
                    lists.add(li);
                } else if (res < 0) lo++;
                else hi--;

            }
        }
        return lists;
    }
}
