package Array;

public class T0066_PlusOne {
    public int[] plusOne(int[] digits) {
        int[] n = new int[digits.length + 1];
        int pos = digits.length;
        for(int i = digits.length-1 ;i>=0;i--){
            if(digits[i] != 9){
                break;
            }
            pos--;
        }
        if(pos == digits.length){
            digits[digits.length-1]++;
            return digits;
        }else if(pos <= 0){
            n[0] = 1;
            return n;
        }else{
            digits[pos-1]++;
            for(int i = pos;i < digits.length;i++){
                digits[i]=0;
            }
            return digits;
        }
    }
}
