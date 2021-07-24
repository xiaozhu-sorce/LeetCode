package Array;

public class T1893_CheckIfAllTheIntegersInARangeAreCovered {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int flag=0;
        for(int j = left;j <= right ; j++){
            for(int i = 0;i < ranges.length ; i++){
                if(j >= ranges[i][0] && j <= ranges[i][1]){
                    flag++;
                    break;
                }
            }
        }
        if(flag >= right-left+1){
            return true;
        }
        return false;
    }
}
