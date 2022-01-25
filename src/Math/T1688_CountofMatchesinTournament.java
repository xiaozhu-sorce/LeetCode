package Math;

public class T1688_CountofMatchesinTournament {
    public int numberOfMatches(int n) {
        int len = 0;
        while(n > 1){
            len += n/2;
            if(n % 2 == 1)
                n++;
            n/=2;
        }
        return len;
    }
}
