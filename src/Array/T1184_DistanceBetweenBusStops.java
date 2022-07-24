package Array;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-07-24 20:10
 **/
public class T1184_DistanceBetweenBusStops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int i = 0, j = 0;
        int a = 0, b = 0;
        if (start > destination) {
            int swap = destination;
            destination = start;
            start = swap;
        }

        while (i < start) {
            a += distance[i++];
        }
        j = i;
        while (j < destination) {
            b += distance[j++];
        }
        i = j;
        while (i < distance.length) {
            a+=distance[i++];
        }

        return Math.min(a, b);
    }
}
