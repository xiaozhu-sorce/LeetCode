package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T0884_UncommonWordsfromTwoSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        insert(s1,map);
        insert(s2,map);

        List<String> ans = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans.add(entry.getKey());
            }
        }
        return ans.toArray(new String[0]);
    }

    public void insert(String s,Map<String,Integer> map){
        String[] arr = s.split(" ");
        for(String a: arr){
            map.put(a, map.getOrDefault(a,0) + 1);
        }
    }
}
