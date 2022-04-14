package Array;

public class T1672_RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        int m = accounts.length;
        int n = accounts[0].length;
        for (int i = 0;i < m;i++){
            int sum = 0;
            for (int j = 0;j < n;j++)
                sum+=accounts[i][j];
            res = Math.max(sum,res);
        }
        return res;
    }
}
