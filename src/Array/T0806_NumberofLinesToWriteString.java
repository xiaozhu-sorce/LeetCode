package Array;

public class T0806_NumberofLinesToWriteString {
    public int[] numberOfLines(int[] widths, String s) {
        int[] res = new int[2];
        char[] sch = s.toCharArray();
        res[1] = 100;

        for(char ch : sch){
            int i = ch - 'a';
            if(res[1]-widths[i] < 0){
                res[1] = 100-widths[i];
                res[0]++;
            }else
                res[1]-=widths[i];
        }
        res[0]++;
        res[1] = 100-res[1];

        return res;
    }
}
