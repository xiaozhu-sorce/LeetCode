package Contest.biweekly_contest_71;

public class C5987_MinimumDifferenceinSumsAfterRemovalofElements {
    public long minimumDifference(int[] nums) {
        //第71场周赛，未通过，少计算情况。
        int len = nums.length;
        int n = len/3;
        long num = 0;
        long nu = 0;
        long l;

        for(int i = 0 ;i < 2 * n;i++){
            if(i < n){
                num+=nums[i];
            }else{
                num-=nums[i];
            }
        }
        nu = num;
        System.out.println(nu);


        for (int i = 2*n - 1; i >= 0; i--){
            if(i>=n)
                num+=nums[i];
            else
                num-=nums[i];
            l = num;
            for(int j = i + 1; j < len + i + 1 - 2*n; j++){
                if(i>=n)
                    l-=nums[j];
                else
                    l+=nums[j];
                System.out.println(l);
                nu = Math.min(l,nu);
                l = num;
            }
            if(i>=n)
                num-=nums[len + i - 2*n];
            else
                num+=nums[len + i - 2*n];
        }
        return nu;
    }
}
