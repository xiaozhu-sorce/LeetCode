package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T5990_FindAllLonelyNumbersInTheArray {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            if (entry.getValue() == 1)
                if (!map.containsKey(entry.getKey() + 1) && !map.containsKey(entry.getKey() - 1))
                    res.add(entry.getKey());

        return res;
    }
}
