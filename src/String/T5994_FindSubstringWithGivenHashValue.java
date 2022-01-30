package String;

public class T5994_FindSubstringWithGivenHashValue {
    public String subStrHash(String s, int power, int modulo, int k, int hashValue) {
        //超时。测试用例未通过
        for (int j = 0 ; j < s.length() - k ; j++){
            String sb  = s.substring(j, j + k);
            char[] ch = sb.toCharArray();
            int hash = 0;
            for(int i = 0; i < k; i++){
                hash += (ch[i] - 'a' + 1) * Math.pow(power,i);
            }
            hash %= modulo;
            if(hash == hashValue)
                return sb;
       }
        return s;
    }
}
