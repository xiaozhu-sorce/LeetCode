package Greedy;

import java.util.Arrays;

public class T1689_PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
        int[] a = new int[10];
        int s = 0,m;
        Arrays.fill(a, 0); //填充数组
        for (int  i=0;i < n.length();i++){
            m = n.charAt(i) - '0'; //依次取出字符串中的每个字符
            a[m]++;
            if(m>s) s=m;
        }
        return s;
    }
}
