package String;

public class T1816_TruncateSentence {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int time = 0;
        for(String data: s.split(" ")){
            sb.append(data);
            time++;
            if(time == k){
                break;
            }
            sb.append(" ");
        }

        return sb.toString();
    }
}
