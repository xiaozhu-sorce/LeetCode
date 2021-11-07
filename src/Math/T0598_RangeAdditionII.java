package Math;

public class T0598_RangeAdditionII {
    public int maxCount1(int m, int n, int[][] ops) {
        int i,lmin = m,cmin = n;
        for(i=0;i<ops.length;i++){
            lmin = Math.min(lmin,ops[i][0]);
            cmin = Math.min(cmin,ops[i][1]);
        }
        return lmin*cmin;
    }

    public int maxCount2(int m, int n, int[][] ops) {
        int i,j;
        if(ops.length == 0){
            return m*n;
        }
        int lmin = ops[0][0],cmin = ops[0][1];
        for(i=1;i<ops.length;i++){
            if(lmin > ops[i][0]){
                lmin = ops[i][0];
            }
        }
        for(j=1;j<ops.length;j++){
            if(cmin > ops[j][1]){
                cmin = ops[j][1];
            }
        }
        return lmin*cmin;
    }
}
