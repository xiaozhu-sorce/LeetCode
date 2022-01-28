package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class T1996_TheNumberofWeakCharactersintheGame {
    public int numberOfWeakCharacters(int[][] properties) {
        int len = 0;
        Arrays.sort(properties,(a,b)->{
            return a[0] == b[0] ? a[1] - b[1] : b[0] - a[0];
        });
        int maxDef = 0;
        for(int[] p : properties){
            if (p[1] < maxDef) {
                len++;
            } else {
                maxDef = p[1];
            }

        }

        return len;
    }
}
