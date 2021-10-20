package Dynamicprogramming;

public class T1137_NthTribonacciNumber {
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        }else if(n == 1||n == 2){
            return 1;
        }

        int p =0,q =1,r=1,s=2;
        for(int i = 3;i <= n;i++){
            s = p+q+r;
            p = q;
            q = r;
            r = s;
        }
        return s;
    }
}
