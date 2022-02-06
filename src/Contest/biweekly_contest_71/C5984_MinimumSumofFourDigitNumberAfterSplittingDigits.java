package Contest.biweekly_contest_71;

import java.util.Arrays;

public class C5984_MinimumSumofFourDigitNumberAfterSplittingDigits {
    public int minimumSum(int num) {
        int n[] = new int[4];
        int ans;
        for(int i = 0 ; i < 4;i++){
            n[i] = num%10;
            num/=10;
        }

        Arrays.sort(n);

        ans = n[0]*10+n[2] + n[1]*10+n[3];
        return ans;
    }
}
