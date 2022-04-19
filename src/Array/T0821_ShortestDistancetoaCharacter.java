package Array;

import java.util.Arrays;

public class T0821_ShortestDistancetoaCharacter {
    public int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        Arrays.fill(ans, s.length() - 1);

        for (int i = 0, j = -1; i < s.length(); i++) {
            if (s.charAt(i) == c) j = i;
            if (j != -1) ans[i] = i - j;
        }

        for (int i = s.length() - 1, j = -1; i >= 0; i--) {
            if (s.charAt(i) == c) j = i;
            if (j != -1) ans[i] = Math.min(ans[i], j - i);
        }

        return ans;
    }
}
