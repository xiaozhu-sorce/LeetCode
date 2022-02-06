package Contest.biweekly_contest_71;

public class C5985_PartitionArrayAccordingtoGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int len = nums.length;
        int n[] = new int[len];
        int j = 0 ;
        int a = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] < pivot)
                n[j++] = nums[i];
            else if(nums[i] == pivot)
                a++;
        }
        for(int i = 0; i < a;i++)
            n[j++] = pivot;

        for(int i = 0; i < len; i++)
            if(nums[i] > pivot)
                n[j++] = nums[i];
        return n;
    }
}
