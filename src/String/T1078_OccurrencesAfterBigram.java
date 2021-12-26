package String;

import java.util.ArrayList;
import java.util.List;

public class T1078_OccurrencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        String[] ss = text.split(" ");
        int n = ss.length;
        List<String> list = new ArrayList<>();
        for (int i = 0; i + 2 < n; i++) {
            if (ss[i].equals(first) && ss[i + 1].equals(second))
                list.add(ss[i + 2]);
        }
        return list.toArray(new String[list.size()]);
    }
}
