package BinarySearch;

public class T0367_ValidPerfectSquare {
    public boolean isPerfectSquare1(int num) {
        long l = 0, r = num;
        while (l < r) {
            long mid = (l + r + 1) /2;
            if (mid * mid <= num) l = mid;
            else r = mid - 1;
        }
        return r * r == num;
    }

    public boolean isPerfectSquare2(int num) {
        int i,x = num;
        if(x == 1){
            return true;
        }
        for(i = 1;i<num;i+=2){
            x -=i;
            if(x<=0)
                break;
        }
        if(x == 0)
            return true;
        return false;
    }
}
