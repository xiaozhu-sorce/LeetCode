package Array;

public class T0717_1_bitand2_bitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        boolean flag = false;
        for(int i = 0; i < bits.length;){
            if(i == bits.length-1 && bits[i] == 0)
                flag = true;
            if(bits[i] == 1)
                i+=2;
            else
                i++;
        }
        return flag;
    }
}
