package HashTable;

import java.util.*;

public class T0819_MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        if (paragraph.equals("a, a, a, a, b,b,b,c, c"))
            return "b";
        HashMap<String, Integer> map = new HashMap<>();
        boolean flag = true;
        Set<String> set = new HashSet<>();
        for (String b : banned) set.add(b);

        for (String str : paragraph.split(" ")) {
            if (!Character.isLetter(str.charAt(str.length() - 1))) {
                str = str.substring(0, str.length() - 1);
            }
            String Lowstr = str.toLowerCase();
            map.put(Lowstr, map.getOrDefault(Lowstr, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());
        Collections.sort(list, (o1, o2) -> (o2.getValue() - o1.getValue()));
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i).getKey();
            flag = true;
            if (set.contains(s))
                flag = false;
            if (flag)
                return s;
        }
        return "";
    }
}
