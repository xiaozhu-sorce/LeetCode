package String;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-10-05 16:38
 **/
public class T0921_MinimumAddtoMakeParenthesesValid {
    public int minAddToMakeValid(String s) {
        int res = 0;
        int need = 0;
        for (int i = 0;i < s.length();i++){
            if (s.charAt(i) == '('){
                need++;
            }
            if (s.charAt(i) == ')'){
                need--;
                if (need == -1){
                    need = 0;
                    res++;
                }
            }
        }
        return need + res;
    }
}
