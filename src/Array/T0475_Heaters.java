package Array;

import java.util.Arrays;

public class T0475_Heaters {
    public int findRadius(int[] houses, int[] heaters) {
        int max = 0,len = 0;
        int i,j,site;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        for(i = 0 ;i < houses.length;i++){
            site = houses[i];
            len = Math.abs(heaters[0] - site);
            for(j = 0 ;j < heaters.length;j++){
                if(len > Math.abs(heaters[j]-site))
                    len = Math.abs(heaters[j]-site);
            }
            max = Math.max(len,max);
        }
        return max;
    }
}
