package DynamicProgramming;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-16 23:15
 **/
public class T0312__BurstBalloons {
    //回溯法解决，超时了！！！
    int max = 0;

    public void backtrack(List<Integer> nums, int res) {
        if (nums.isEmpty())
            max = Math.max(max, res);
        for (int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);
            int cur = n;
            if (i - 1 >= 0)
                cur = nums.get(i) * nums.get(i - 1);
            if (i + 1 < nums.size())
                cur *= nums.get(i + 1);
            nums.remove(i);
            backtrack(nums, res + cur);
            nums.add(i, n);
        }
    }

    public int maxCoins(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for (int num : nums) {
            list.add(num);
        }
        backtrack(list, 0);
        return max;
    }


    //dp  区间dp
    public int maxCoins1(int[] nums) {
        int n = nums.length;
        // 创建一个辅助数组，并在首尾各添加1，方便处理边界情况
        int[] temp = new int[n+2];
        temp[0] = 1;
        temp[n+1] = 1;
        for(int i=0; i<n; i++){
            temp[i+1] = nums[i];
        }


        int[][] dp = new int[n+2][n+2];
        // len表示开区间长度
        for(int len=3; len<=n+2; len++){
            // i表示开区间左端点
            for(int i=0; i<=n+2-len; i++){
                int res = 0;
                // k为开区间内的索引
                for(int k = i+1; k<i+len-1; k++){
                    int left = dp[i][k];
                    int right = dp[k][i+len-1];
                    res = Math.max(res, left + temp[i]*temp[k]*temp[i+len-1] + right);
                }
                dp[i][i+len-1] = res;
            }
        }
        return dp[0][n+1];
    }
}
