package Array;

import java.util.Arrays;

public class T1725_NumberOfRectanglesThatCanFormTheLargestSquare {
    public int countGoodRectangles(int[][] rectangles) {
        int num = 0,i = 0;
        int len = rectangles.length;
        int[] re = new int[len];
        for(int[] r : rectangles){
            if(r[0] > r[1])
                re[i]=r[1];
            else
                re[i]=r[0];
            i++;
        }
        Arrays.sort(re);
        for(int j = len - 1; j >= 0 ; j--){
            if(re[j] == re[len-1])
                num++;
            else
                break;
        }
        return num;
    }
}
