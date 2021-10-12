package BitManipulation;

public class T0029_DivideTwoIntegers {
    //此种方法过不了测试用例int的最小值，int 最大取值：2147483647 最小取值：-2147483648
    //for循环1取最小值的绝对值是溢出的，所以使用for循环出现了问题。
    public int divide1(int dividend, int divisor) {
        int cout = 0;
        for(long i = Math.abs(dividend);i >= 0 ; i -= Math.abs(divisor)){
            cout++;
        }
        if (divisor == Integer.MIN_VALUE) {
            return dividend == Integer.MIN_VALUE ? 1 : 0;
        }
        if (dividend == 0) {
            return 0;
        }
        if(dividend < 0 &&  divisor > 0  || dividend > 0 && divisor < 0)
            return -cout+1;
        else
            return cout-1;
    }

    //位运算解决此种方法中出现的问题。位运算每移位一次就相当于给原数字乘2
    public int divide2(int dividend, int divisor) {
        long a = Math.abs((long)dividend), b = Math.abs((long)divisor);
        int res = 0;

        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        for(int i= 31;i >= 0;i--){
            if((a>>i)>=b){
                res += 1 << i;
                a -= b << i; //先位移后自减
            }
        }
        return (dividend > 0) == (divisor > 0) ? res : -res;
    }
}
