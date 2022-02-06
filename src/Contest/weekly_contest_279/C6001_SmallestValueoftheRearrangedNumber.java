package Contest.weekly_contest_279;

import java.util.Arrays;

public class C6001_SmallestValueoftheRearrangedNumber {
    public long smallestNumber(long num) {
        if(num == 0)
            return 0;
        long n = 1;
        int s = 0;
        int i = 0;
        long t = Math.abs(num);
        while(t > 0){
            s++;
            t/=10;
        }
        t = Math.abs(num);
        int a[] = new int[s];
        while (t > 0){
            a[i++] = (int) (t%10);
            t/=10;
        }

        Arrays.sort(a);

        if(num >= 0){
            for(i = 0; i < s ;i++){
                if(a[i] != 0)
                    break;
            }
            n=a[i];
            n*=Math.pow(10,i);
            for (int j = i + 1; j < s;j++){
                n*=10;
                n+=a[j];
            }

            return n;
        }else {
            n = a[s - 1];
            for (i = 1; i < s; i++) {
                n *= 10;
                n += a[s - i - 1];
            }
            return -1 * n;
        }
    }
}
