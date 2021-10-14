package BinarySearch;

public class Offer_T069_TheTopOfTheMall {
    public int peakIndexInMountainArray(int[] arr) {
        int right = 0,left = arr.length - 1;
        int mid =(right + left)/2;
        while(arr[mid - 1] > arr[mid]  || arr[mid] < arr[mid + 1]){
            if(arr[mid - 1] > arr[mid]){
                left = mid;
            }else{
                right = mid;
            }
            mid =(right + left)/2;
        }
        return mid;
    }
}
