package String;

public class T2109_AddingSpacestoaString {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < spaces.length;i++ ){
            sb.insert(spaces[i]+i,' ');
        }
        return sb.toString();
    }
}
