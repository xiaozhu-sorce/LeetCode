package Greedy;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-11 17:09
 **/
public class T0011_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int contains = 0;

        while (left < right) {
            int cur = Math.min(height[left], height[right]) * (right - left);
            contains = Math.max(contains, cur);
            if (height[left] < height[right])
                left++;
            else
                right--;

        }


        return contains;
    }
}
