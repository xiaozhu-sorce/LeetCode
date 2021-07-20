package BinarySearch;

public class T0069_Sqrt {
    public int mySqrt(int x) {
        int left = 0,right = x;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(Math.pow(mid,2) == x){
                return mid;
            }
            if(Math.pow(mid,2) < x){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left-1;
    }
}
