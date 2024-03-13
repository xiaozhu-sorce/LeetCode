package Greedy;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-03-13 17:44
 **/
public class T2864_MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder str = new StringBuilder();
        char[] ch = new char[s.length()];
        ch = s.toCharArray();
        int count= 0;
        int len  = s.length();

        for (int i = 0; i < s.length();i++){
            if (ch[i] == '1')   count++;
        }
        if (count == 1){
            while (len-- > 1) {
                str.append('0');
            }
            str.append('1');
        }else{
            int le = len - count;
            while(count-- > 1){
                str.append('1');
            }
            while (le-- > 0 )   str.append('0');
            str.append('1');
        }

        return str.toString();
    }
}
