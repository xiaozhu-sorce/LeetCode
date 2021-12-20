package Math;

public class T5958_NumberofSmoothDescentPeriodsofaStock {
    public long getDescentPeriods(int[] prices) {
        int i,j=1;
        long res = 0;
        for(i = 0; i+1 < prices.length;i++){
            if(prices[i] - prices[i+1] == 1 ){
                j+=1;
                res += j;
            }
            else{
                res+=1;
                j = 1;
            }
        }
        return res+1;
    }
}
