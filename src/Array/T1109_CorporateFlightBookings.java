package Array;

public class T1109_CorporateFlightBookings {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] nums =  new int[n];
        Difference df = new Difference(nums);
        for (int i = 0;i < bookings.length;i++){
            df.increment(bookings[i][0]-1,bookings[i][1]-1,bookings[i][2]);
        }
        return df.result();
    }
}
