package Math;

public class T0884_UncommonWordsfromTwoSentences {
    public int numberOfSteps(int num) {
        int n = 0;
        if(num == 0)
            return 0;
        while(num > 1){
            System.out.println(num);
            if(num == 1)
                break;
            else if(num % 2 == 1)
                num--;
            else
                num >>= 1;
            n++;

        }
        return n+1;
    }
}
