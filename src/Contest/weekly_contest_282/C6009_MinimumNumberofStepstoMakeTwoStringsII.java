package Contest.weekly_contest_282;

import java.util.HashMap;
import java.util.Map;

public class C6009_MinimumNumberofStepstoMakeTwoStringsII {
    public int minSteps(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(char sh : s.toCharArray())
            map.put(sh, map.getOrDefault(sh, 0) + 1);

        for(int i = 0; i < t.length(); i++){
            if(map.getOrDefault(t.charAt(i), 0) > 0){
                count++;
                map.put(t.charAt(i),map.getOrDefault(t.charAt(i), 0)-1);
            }
        }

        return s.length() + t.length() - 2 * count;
    }
}
