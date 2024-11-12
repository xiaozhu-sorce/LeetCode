package Greedy;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-23 19:38
 **/
public class T0045_JumpGameII {
    public int jump(int[] nums) {
        int far = 0;
        int end = 0;
        int jumps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            far = Math.max(far, i + nums[i]);
            if (end == i) {
                jumps++;
                end = far;
            }
        }
        return jumps;
    }
}
