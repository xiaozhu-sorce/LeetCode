package BitManipulation;

public class T0762_PrimeNumberofSetBitsinBinaryRepresentation {
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        int bitNumber;
        for(int i = left;i <= right;i++){
            bitNumber = Integer.bitCount(i);
            System.out.println(bitNumber);
            if(isPrime(bitNumber))
                res++;
        }
        return res;
    }

    public boolean isPrime(int num){
        int len=num/2;
        if(num ==1 || num == 4)
            return false;
        for(int i=2;i<len;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
