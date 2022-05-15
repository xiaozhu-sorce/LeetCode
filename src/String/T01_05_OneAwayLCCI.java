package String;

public class T01_05_OneAwayLCCI {
    public boolean oneEditAway(String first, String second) {
        int n = first.length(), m = second.length();
        if (Math.abs(n - m) > 1) return false;
        if (n > m) return oneEditAway(second, first);
        int cnt = 0;
        int i = 0, j = 0;
        while (i < n && j < m && cnt <= 1) {
            char a = first.charAt(i);
            char b = second.charAt(j);
            if (a == b) {
                i++;
                j++;
            } else {
                if (n == m) {
                    i++;
                    j++;
                } else {
                    j++;
                }
                cnt++;
            }
        }

        return cnt <= 1;
    }
}
