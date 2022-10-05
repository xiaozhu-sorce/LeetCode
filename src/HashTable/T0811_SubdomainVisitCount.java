package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-10-05 16:52
 **/
public class T0811_SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpd) {
        List<String> l = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < cpd.length; i++) {
            String[] res = cpd[i].split(" ");
            String[] se = res[1].split("\\.");
            int num = Integer.valueOf(res[0]);
            int len = se.length;
            String str = "";
            for (int j = len - 1; j >= 0; j--) {
                if (j == len - 1) {
                    str = se[j];
                } else {
                    str = se[j] + "." + str;
                }
                map.put(str, map.getOrDefault(str, 0) + num);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            l.add(entry.getValue() + " " + entry.getKey());
        }
        return l;
    }
}
