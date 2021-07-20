package BitManipulation;

public class T0461_HammingDistance {
    public int hammingDistance(int x, int y) {
        int n = x ^ y;
        int sum = 0;
        while(n != 0){
            sum += n & 1;
            n >>= 1;
        }
        return sum;
    }
}
