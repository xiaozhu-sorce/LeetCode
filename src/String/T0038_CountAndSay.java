package String;

public class T0038_CountAndSay {

    public String countAndSay(int n) {

        if(n == 1){
            return "1";
        }

        String last = countAndSay(n-1);
        StringBuilder res = new StringBuilder();
        char curNum = last.charAt(0);
        int flag = 0;
        for(int i = 0; i < last.length(); i++){
            if(last.charAt(i) == curNum){
                flag++;
            }else{
                res.append(String.valueOf(flag));
                res.append(last.charAt(i-1));
                flag = 1;
                curNum = last.charAt(i);
            }
        }

        res.append(String.valueOf(flag));
        res.append(last.charAt(last.length()-1));
        return res.toString();
    }
}
