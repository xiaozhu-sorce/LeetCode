package Design;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class T0380_InsertDeleteGetRandomO1 {
    //num 数组存放元素，在其中进行存取。每个值的索引存放在map中
    int[] num = new int[200000];
    //map<值,该值对应的数组中存放的位置>
    Map<Integer,Integer> map = new HashMap<>();
    //索引
    int idx = -1;
    public T0380_InsertDeleteGetRandomO1() {

    }

    /** 如果 val 不存在集合中，则插入并返回 true，否则直接返回 false */
    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;
        else {
            num[++idx] = val;
            map.put(val, idx);

        }
        return true;
    }

    /** 如果 val 在集合中，则删除并返回 true，否则直接返回 false */
    public boolean remove(int val) {
        if (!map.containsKey(val))
            return false;
        else {
            int loc = map.remove(val);
            if (loc != idx) map.put(num[idx], loc);
            num[loc] = num[idx--];
        }
        return true;
    }

    public int getRandom() {
        Random random = new Random();
        return num[random.nextInt(idx+1)];
    }
}
