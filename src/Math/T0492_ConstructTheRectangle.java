package Math;

public class T0492_ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        for (int i = (int)(Math.sqrt(area)); ;i--) {
            if (area % i == 0) return new int[]{area / i, i};
        }
    }
}
