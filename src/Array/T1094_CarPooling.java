package Array;

public class T1094_CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] nums = new int[1000];

        Difference df = new Difference(nums);
        for (int[] trip : trips){
            int val = trip[0];
            int m = trip[1];
            int n = trip[2]-1;
            df.increment(m,n,val);
        }
        int[] res = df.result();
        for(int re : res){
            if(re > capacity)
                return false;
        }
        return true;
    }
}
