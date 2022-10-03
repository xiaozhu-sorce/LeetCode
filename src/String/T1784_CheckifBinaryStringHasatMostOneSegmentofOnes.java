package String;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-10-03 19:38
 **/
public class T1784_CheckifBinaryStringHasatMostOneSegmentofOnes {
    public boolean checkOnesSegment(String s) {
        //  return !s.contains("01");
        int idx = 0;
        int cnt = 1;

        while (idx < s.length() && s.charAt(idx) == '1')    idx++;
        while (idx < s.length()){
            while(idx < s.length() && s.charAt(idx) == '0') idx++;

            if(idx < s.length()){
                while(idx < s.length() && s.charAt(idx) == '1') idx++;
                cnt++;
            }
        }

        return cnt <= 1;
    }
}
