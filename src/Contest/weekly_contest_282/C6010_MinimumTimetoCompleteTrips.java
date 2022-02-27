package Contest.weekly_contest_282;

import java.util.Arrays;

public class C6010_MinimumTimetoCompleteTrips {
    public long minimumTime(int[] time, int totalTrips) {
        if(time.length == 1){
            return time[0] * totalTrips;
        }
        Arrays.sort(time);
        long l = 0;
        long r = totalTrips*time[time.length-1];
        long mid = (l+r)/2;
        long total;

        while(l < r){
            total = 0;
            for(int i = 0;i < time.length;i++){
                total+= mid/time[i];
            }
            if(total < totalTrips)
                l = mid+1;
            else
                r = mid;
            mid = (l + r)/2;
        }
        return mid;

//copy大佬解法，还不懂为什么自己的错了呜呜
//        long lo = 0;
//        long hi = 100000000000000L;
//
//
//        while(lo<hi){
//            long mi = (lo+hi)/2L;
//
//            long s=  0;
//            for(int t:time){
//                s += mi/t;
//            }
//            if(s>=tt){
//                hi = mi;
//            }else{
//                lo = mi+1;
//            }
//
//        }
//        return lo;
    }
}
