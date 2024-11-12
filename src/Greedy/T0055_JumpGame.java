package Greedy;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-16 16:52
 **/
public class T0055_JumpGame {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max >= nums.length - 1)
                return true;
            if (max >= i)
                max = Math.max(max, i + nums[i]);
        }
        return false;
    }
}
