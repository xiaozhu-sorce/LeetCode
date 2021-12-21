package String;

public class T1154_DayoftheYear {
    public int dayOfYear(String date) {
        int[] monthDay = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int i = 0;
        int sum = 0;
        int dateInt[] = new int[4];
        for(String retval : date.split("-")){
            dateInt[i++] = Integer.parseInt(retval);
        }
        if(isLeapyear(dateInt[0]) == 366){
            monthDay[2] = 29;
        }

        for(int j = 0; j < dateInt[1]; j++){
            sum+=monthDay[j];
        }
        sum+=dateInt[2];
        return sum;
    }

    public String delS(String str){
        char[] s = str.toCharArray();
        if(s[0] == '0'){
            s[0] = s[1];
            s[1] = '\0';
        }
        return s.toString();
    }

    public int isLeapyear(int year){
        if((year%4==0&&year%100!=0)||year%400==0)
            return 366;
        else
            return 365;
    }
}

