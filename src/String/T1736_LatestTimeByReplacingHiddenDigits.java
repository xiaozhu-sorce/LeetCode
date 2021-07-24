package String;

public class T1736_LatestTimeByReplacingHiddenDigits {
    public String maximumTime(String time) {
        char []times = time.toCharArray();
        if(times[0] == '?'){
            if(times[1]>='4'&&times[1]<='9'){
                times[0] = '1';
            }else{
                times[0] = '2';
            }
        }
        if(times[1] == '?'){
            if(times[0]=='2'){
                times[1] = '3';
            }else{
                times[1] = '9';
            }
        }
        if(times[3] == '?'){
            times[3] = '5';
        }
        if(times[4] == '?'){
            times[4] = '9';
        }
        String n = String.valueOf(times);
        return n;
    }
}
