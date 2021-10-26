package Array;

public class T0496_NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length];
        int i,j,k;
        for(i=0;i<nums1.length;i++)
            num[i] = -1;
        for(i = 0;i<nums1.length;i++){
            for(k = 0;k < nums2.length;k++){
                if(nums1[i] == nums2[k]){
                    break;
                }
            }
            for(j = k;j < nums2.length;j++){
                if(nums1[i] < nums2[j]){
                    num[i] = nums2[j];
                    break;
                }
            }

        }
        return num;
    }
}
