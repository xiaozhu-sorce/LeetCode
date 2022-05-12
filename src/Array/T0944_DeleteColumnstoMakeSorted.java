package Array;

public class T0944_DeleteColumnstoMakeSorted {
    public int minDeletionSize(String[] strs) {
        int res = 0;
        int n = strs.length;
        int len = strs[0].length();
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < n; j++) {
                if (strs[j].charAt(i) < strs[j-1].charAt(i)) {
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
