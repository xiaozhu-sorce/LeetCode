package Array;

import java.util.ArrayList;
import java.util.List;

public class T0969_PancakeSorting {
    List<Integer> list = new ArrayList<>();

    public List<Integer> pancakeSort(int[] arr) {
        sort(arr,arr.length-1);
        return list;
    }

    public void sort(int[] arr,int n){
        if(n == 1)
            return;

        int maxCake = 0;
        int maxCakeIndex  = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > maxCake){
                maxCake = arr[i];
                maxCakeIndex = i;
            }
        }

        reverse(arr,0,maxCakeIndex);
        list.add(maxCakeIndex+1);
        reverse(arr, 0, n - 1);
        list.add(n);

        sort(arr, n - 1);
    }

    public void reverse(int[] arr,int i,int j){
        //排序
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
