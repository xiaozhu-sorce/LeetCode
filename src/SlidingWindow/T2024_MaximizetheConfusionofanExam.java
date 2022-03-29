package SlidingWindow;

public class T2024_MaximizetheConfusionofanExam {
    String s;
    int len;
    public int maxConsecutiveAnswers(String answerKey, int k) {
        s = answerKey;
        len = k;
        return Math.max(getChar('T'),getChar('F'));
    }

    public int getChar(char c){
        int ans = 0;
        int i,j,cnt = 0;
        for(i = 0,j = 0;i < s.length();i++){
            if(s.charAt(i) == c)  cnt++;
            while(cnt > len){
                if(s.charAt(j) == c)    cnt--;
                j++;
            }
            ans = Math.max(ans,i-j+1);
        }
        return ans;
    }
}
