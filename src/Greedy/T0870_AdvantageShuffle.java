package Greedy;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-10-08 20:30
 **/
public class T0870_AdvantageShuffle {
    //TLE
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] num = new int[n];
        int idx = 0;

        Arrays.sort(nums1);
        for (int i = 0; i < n; i++){
            int j = 0;
            while(j < n && nums2[i] >= nums1[j]) j++;

            if (j >= n){
                int k = 0;
                while(nums1[k] == -1)   k++;
                num[i] = nums1[k];
                nums1[k] = -1;
            }else{
                num[i] = nums1[j];
                nums1[j] = -1;
            }
        }

        return num;
    }

    public int[] advantageCount1(int[] nums1, int[] nums2) {
        int n = nums1.length;
        PriorityQueue<int[]> max = new PriorityQueue<>(
            (int[] pair1,int[] pair2) -> {
                return pair2[1] - pair1[1];
            }
        );

        int[] res = new int[n];

        for (int i = 0; i < n;i ++){
            max.offer(new int[]{i,nums2[i]});
        }
        Arrays.sort(nums1);
        int left = 0, right = n-1;

        while(!max.isEmpty()){
            int[] p = max.poll();
            int a = p[1];int b = p[2];

            if (b < nums1[right]){
                res[a] = nums1[right--];
            }else{
                res[a] = nums1[left++];
            }
        }

        return res;
    }
}
