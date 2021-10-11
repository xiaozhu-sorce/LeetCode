package BinarySearch;

public class T0070_ClimbingStairs {
    public int climbStairs1(int n) {
        if(n == 0)
        {
            return 1;
        }else if(n == 1){
            return 1;
        }else{
            return climbStairs1(n-1)+climbStairs1(n-2);
        }
    }

    public int climbStairs2(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
