package BitManipulation;

public class T0693_BinaryNumberwithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int res = 2;
        while(n > 0){
            int pre = n & 1;
            if(res == pre)    return false;
            res = pre;
            n>>=1;
        }
        return true;
    }
}
