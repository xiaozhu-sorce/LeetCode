package String;

public class T2108_FindFirstPalindromicStringintheArray {
    public String firstPalindrome(String[] words) {
        String sub = new String();
        for(String word:words){
            if(ifPalindromic(word)){
                sub = word;
                break;
            }
    }
    return sub;
}
    public boolean ifPalindromic(String str){
        StringBuilder sb = new StringBuilder(str);
        int len = str.length()-1;
        int i,count = 0;
        for(i = 0; i < str.length();i++,len--){
            if(sb.charAt(i) == sb.charAt(len))
                count++;
        }
        if(count == str.length())
            return true;
        else
            return false;
    }
}
