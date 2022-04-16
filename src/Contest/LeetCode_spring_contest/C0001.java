package Contest.LeetCode_spring_contest;

public class C0001 {
    public int giveGem(int[] gem, int[][] operations) {
        int mx = 0,mn = Integer.MIN_VALUE;

        int m = operations.length;
        for (int i = 0;i < m;i++){
            int from = operations[i][0];
            int to = operations[i][1];
            gem[to] += gem[from]/2;
            gem[from]/=2;
        }

        for (int i = 0;i<gem.length;i++){
            mx = Math.max(gem[i],mx);
            mn = Math.min(gem[i],mn);
        }

        return mx-mn;
    }
}
