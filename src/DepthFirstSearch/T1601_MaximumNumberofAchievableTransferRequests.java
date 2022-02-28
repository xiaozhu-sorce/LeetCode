package DepthFirstSearch;


public class T1601_MaximumNumberofAchievableTransferRequests {
    // 使用递归回溯进行求解
    // 这里对dfs函数的理解：从index到需要移动的人员的个数进行选择，包含index在内的有多少人可以得到转移（这里看的只是count函数的最终状态，所以需要使用for循环进行requets数组的遍历）
    int max = 0;
    public int maximumRequests(int n, int[][] requests) {
        int[] count = new int[n];
        int res = 0;
        dfs(count,requests,res,0);
        return max;
    }

    public void dfs(int[] count,int[][]re,int res,int index){
        if(isCheck(count)){
            max = Math.max(res,max);
        }

        for(int i = index; i < re.length;i++){
            count[re[i][0]]--;
            count[re[i][1]]++;
            res++;
            dfs(count,re,res,i+1);
            count[re[i][0]]++;
            count[re[i][1]]--;
            res--;
        }
    }

    public boolean isCheck(int[] count) {
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0)
                return false;
        }
        return true;
    }
}
