package Contest.weekly_contest_282;

public class C6008_CountingWordsWithaGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        int num = 0;
        for(String s : words){
            if(s.length() >= pref.length()  && s.substring(0,pref.length()).equals(pref))   num++;
        }
        return num;
    }
}
