package Array;

public class T1828_QueriesOnNumberOfPointsInsideACircle {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] a=new int[queries.length];
        int tmp=0;
        for(int i=0;i<queries.length;i++){
            tmp=0;
            for(int j=0;j<points.length;j++){
                if(Math.sqrt(Math.pow(Math.abs(queries[i][0]-points[j][0]),2) +Math.pow(Math.abs(queries[i][1]-points[j][1]),2)) <= queries[i][2] ){
                    tmp++;
                }
            }
            a[i]=tmp;
        }
        return a;
    }
}
