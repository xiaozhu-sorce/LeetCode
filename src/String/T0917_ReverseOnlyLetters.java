package String;

public class T0917_ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        char ch;
        int i = 0,j = s.length()-1;

        while(i < j){
            while(i < j && !Character.isLetter(chars[i])) {
                i++;
                if(i >= s.length()) break;
            }
            while(i < j && !Character.isLetter(chars[j])) {
                j--;
                if(j <= 0) break;
            }

            if(i >= s.length() && j <= 0) break;

            ch = chars[i];
            chars[i] = chars[j];
            chars[j] = ch;
            i++;j--;
        }

        return String.valueOf(chars);
    }
}
