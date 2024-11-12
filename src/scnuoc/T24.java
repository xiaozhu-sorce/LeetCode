package scnuoc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-24 19:04
 **/
public class T24 {
    public static boolean backtrack(int[] nums, int k, int[] bucket, int target, int index) {
        if (index == -1) {
            return true;
        }

        for (int j = 0; j < k; j++) {
            if (j > 0 && bucket[j] == target) continue;
            if (bucket[j] + nums[index] > target) continue;

            bucket[j] += nums[index];
            if (backtrack(nums, k, bucket, target, index - 1)) return true;
            bucket[j] -= nums[index];
        }
        return false;
    }

    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int target = 0;
        for (int n : nums) target += n;
        if (target % k == 0) target /= k;
        else return false;
        Arrays.sort(nums);

        int[] bucket = new int[k];

        return backtrack(nums, k, bucket, target, nums.length - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] str = s.split(" ");
        int[] a = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        int k = scanner.nextInt();
        System.out.print(canPartitionKSubsets(a, k));
    }
}
