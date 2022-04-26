package Math;

public class T0883_ProjectionAreaof3DShapes {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int xy = 0, xz = 0, zy = 0;
        int temp;
        int[] t = new int[n];

        for (int[] ints : grid) {
            temp = 0;
            for (int j = 0; j < n; j++) {
                if (ints[j] != 0) xy++;
                temp = Math.max(temp, ints[j]);
                t[j] = Math.max(t[j], ints[j]);
            }
            xz += temp;
        }

        for (int i = 0; i < n; i++)
            zy += t[i];

        return xy + xz + zy;
    }
}
