package Greedy;

public class T1405_LongestHappyString {
    public String longestDiverseString(int a, int b, int c) {
        int[][] arr = {{'a', a}, {'b', b}, {'c', c}};
        StringBuilder sb = new StringBuilder(a + b + c);

        while (true) {
            Arrays.sort(arr, (x, y) -> y[1] - x[1]);
            int n = sb.length();
            if (arr[0][1] == 0) {
                break;
            }

            if (n >= 2 && sb.charAt(n - 1) == arr[0][0] && sb.charAt(n - 2) == arr[0][0]) {
                if (arr[1][1] == 0) {
                    break;
                }
                sb.append((char) arr[1][0]);
                arr[1][1]--;
            } else {
                sb.append((char) arr[0][0]);
                arr[0][1]--;
            }
        }

        return sb.toString();
    }
}
