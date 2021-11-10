package Array;

public class T0495_TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int len = duration;
        int diff;
        for(int i = 1;i < timeSeries.length;i++){
            diff = timeSeries[i] - timeSeries[i-1];
            if(diff > duration)
                len += duration;
            else
                len += diff;
        }
        return len;
    }
}
