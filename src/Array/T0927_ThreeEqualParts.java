package Array;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-10-06 16:41
 **/
public class T0927_ThreeEqualParts {

    public int[] threeEqualParts1(int[] arr) {
        int[] fail = new int[]{-1, -1};

        int n = arr.length, cnt = 0;
        for (int i = 0; i < n; i++) cnt += arr[i];
        if (cnt == 0) return new int[]{0, 2};
        if (cnt % 3 != 0) return fail;

        int t = cnt / 3;
        int[][] ins = new int[3][t];
        for (int i = 0, j = -1, k = 0, p = 0, idx = 0; i < n; i++) {
            if (arr[i] == 0) continue;
            if (j != -1) ins[p][idx++] = i - j;
            if (++k == t) {
                j = -1; k = 0; p++; idx = 0;
            } else {
                j = i;
            }
        }
        for (int i = 0; i < t; i++) {
            if (ins[0][i] == ins[1][i] && ins[0][i] == ins[2][i] && ins[1][i] == ins[2][i]) continue;
            return fail;
        }

        int l1 = -1, l2 = -1, r1 = -1, r2 = -1;
        for (int i = 0, k = 0; i < n; i++) {
            k += arr[i];
            if (k == t) {
                if (l1 == -1) l1 = i;
            } else if (k == t + 1) {
                l2 = i - 1;
                break;
            }
        }
        for (int i = n - 1, k = 0; i >= 0; i--) {
            k += arr[i];
            if (k == t) {
                if (r2 == -1) r2 = i;
            } else if (k == t + 1) {
                r1 = i + 1;
                break;
            }
        }
        int d = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 1) break;
            d++;
        }
        if (l1 + d > l2 || r1 + d > r2) return fail;
        return new int[]{l1 + d, r1 + d};
    }
}
