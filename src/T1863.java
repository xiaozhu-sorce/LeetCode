public class T1863 {
    int res = 0;

    public int subsetXORSum(int[] nums) {
        if(nums.length == 1)return nums[0];
        dfs(nums,0,0);
        return res;
    }

    public void dfs(int[] nums,int i ,int xor_sum){

        if(i == nums.length){
            res+= xor_sum;
            return;
        }

        dfs(nums,i+1,xor_sum ^ nums[i]);

        dfs(nums,i+1,xor_sum);
    }
}
