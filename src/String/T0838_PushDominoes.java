package String;

public class T0838_PushDominoes {
    public String pushDominoes(String dominoes) {
        dominoes = "L" + dominoes + "R";
        char[] s = dominoes.toCharArray();
        int left = 0,right = 0;
        int n = dominoes.length();
        int i,j;

        while(right < n){

            if(s[right] == '.'){
                right++;
                continue;
            }

            if(s[left] == s[right]){
                while(left < right){
                    left++;
                    s[left] = s[right];
                }
            }

            if(s[left] == 'R' && s[right] == 'L'){
                j = left;
                i = right;
                while(j < i){
                    s[j++] = 'R';
                    s[i--] = 'L';
                }
            }

            left = right;
            right++;
        }
        String ss = new String(String.valueOf(s));
        return ss.substring(1,n-1);
    }
}
