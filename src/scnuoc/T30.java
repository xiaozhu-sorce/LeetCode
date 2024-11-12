package scnuoc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-22 17:06
 **/
public class T30 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        int lo, hi;
        for (int i = 0; i < nums.length; i++) {
            hi = nums.length - 1;
            if (i > 0 && nums[i] == nums[i-1])  continue;
            for (lo = i + 1; lo < hi; ) {
                if (lo > i + 1 && nums[lo] == nums[lo - 1]) {
                    lo++;
                    continue;
                }
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
                    lo++;
                } else if (res < 0) lo++;
                else {
                    hi--;
                }
            }
        }
        return lists;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len];

        for (int j = 0; j < len; ) {
            a[j++] = sc.nextInt();
        }

        List<List<Integer>> result = threeSum(a);

        System.out.print("[");
        for (int i = 0; i < result.size(); i++) {
            List<Integer> list = result.get(i);
            System.out.print("[");
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j));
                if (j != list.size() - 1)
                    System.out.print(",");
            }
            System.out.print("]");
            if (i != result.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
